package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cliente;
import negocio.Compra;
import negocio.Produto;

public class CompraDAO {
	// PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	// MÉTODOS DA CLASSE
	public Collection<Compra> getTodos() throws Exception {
		ArrayList<Compra> retorno = new ArrayList<Compra>();

		// CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();

		// SUBMETER UMA QUERY AO BANCO
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CMP_COMPRA, PRD_PRODUTO, CLI_CLIENTE "
															  + "WHERE CMP_IDPRODUTO = PRD_ID AND CMP_IDCLIENTE = CLI_ID");
		objCursor = objExecucao.executeQuery();

		// NAVEGAR PELAS LINHAS DAS TABELAS QUE RETORNARAM AO BANCO
		while (objCursor.next()) {
			Compra objCompra = new Compra();
			objCompra.setId(objCursor.getInt("CMP_ID"));
			objCompra.setObjProduto(new Produto(objCursor.getInt("PRD_ID"), objCursor.getString("PRD_NOME"),
					objCursor.getDouble("PRD_PRECO")));
			objCompra.setObjCliente(new Cliente(objCursor.getInt("CLI_ID"), objCursor.getString("CLI_NOME"),
					objCursor.getString("CLI_CARTAODECREDITO")));
			objCompra.setDataDaPersistencia(objCursor.getString("CMP_DATA"));
			objCompra.setQuantidade(objCursor.getInt("CMP_QUANTIDADE"));

			retorno.add(objCompra);
		}

		// DESCONECTANDO DO BANCO
		objBanco.desconectar();

		return retorno;
	}
	
	public void persistir(Compra objCompra) throws Exception {

		// CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();

		// SUBMETER UMA QUERY AO BANCO
		if(objCompra.getId() == 0) {
			objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO CMP_COMPRA " + 
																	"(CMP_IDPRODUTO, CMP_IDCLIENTE, CMP_DATA, CMP_QUANTIDADE) " + 
																	"VALUES" + 
																	"(?, ?, ?, ?)");

			objExecucao.setInt(1, objCompra.getObjProduto().getId());
			objExecucao.setInt(2, objCompra.getObjCliente().getId());
			objExecucao.setString(3, objCompra.getDataParaPersistencia());
			objExecucao.setInt(4, objCompra.getQuantidade());
			
			objExecucao.executeUpdate();
		} else {
			objExecucao = objBanco.getObjConexao().prepareStatement("UPDATE CMP_COMPRA SET " + 
																	"CMP_IDPRODUTO = ?, " + 
																	"CMP_IDCLIENTE = ?, " + 
																	"CMP_DATA = ?, " + 
																	"CMP_QUANTIDADE = ?, " +
																	"WHERE CMP_ID = ?"); 
			
			objExecucao.setInt(1, objCompra.getObjProduto().getId());
			objExecucao.setInt(2, objCompra.getObjCliente().getId());
			objExecucao.setString(3, objCompra.getDataParaPersistencia());
			objExecucao.setInt(4, objCompra.getQuantidade());
			objExecucao.setInt(5, objCompra.getId());
			
			objExecucao.executeUpdate();
		}


		// DESCONECTANDO DO BANCO
		objBanco.desconectar();
	}
	
	public void despersistir(Compra objCompra) throws Exception {
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("DELETE FROM CMP_COMPRA " +
																"WHERE CMP_ID = ?");
		objExecucao.setInt(1, objCompra.getId());
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
