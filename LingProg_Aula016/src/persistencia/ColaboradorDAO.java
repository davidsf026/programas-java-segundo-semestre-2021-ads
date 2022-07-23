package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cargo;
import negocio.Colaborador;

public class ColaboradorDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODOS DA CLASSE
	public Collection<Colaborador> getTodos() throws Exception {
		ArrayList<Colaborador> retorno = new ArrayList<Colaborador>();
		
		//CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		//SUBMETER UMA QUERY AO BANCO
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * " +
																"FROM COL_COLABORADOR, CRG_CARGO " +
																"WHERE COL_IDCARGO = CRG_ID");
		objCursor = objExecucao.executeQuery();
		
		//NAVEGAR PELAS LINHAS DAS TABELAS QUE RETORNARAM AO BANCO
		while (objCursor.next()) {
			retorno.add(new Colaborador(objCursor.getInt("COL_ID"),
										new Cargo(objCursor.getInt("CRG_ID"),
												  objCursor.getString("CRG_NOME"),
										 		  objCursor.getDouble("CRG_SALARIO")),
								 		objCursor.getString("COL_SALARIO")));
		}
		
		//DESCONECTANDO DO BANCO
		objBanco.desconectar();
		
		return retorno;
	}
	
	public void persistir(Colaborador objColaborador) throws Exception {

		// CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();

		// SUBMETER UMA QUERY AO BANCO
		if(objColaborador.getId() == 0) {
			objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO CMP_COMPRA " + 
																	"(COL_IDCARGO, COL_NOME) " + 
																	"VALUES" + 
																	"(?, ?)");
			
		} else {
			objExecucao = objBanco.getObjConexao().prepareStatement("UPDATE CMP_COMPRA SET " + 
																	"COL_IDCARGO = ?, " + 
																	"COL_NOME = ?, " + 
																	"WHERE COL_NOME = ?"); 
		}
		objExecucao.setInt(1, objColaborador.getObjCargo().getId());
		objExecucao.setString(2, objColaborador.getNome());
		if(objColaborador.getId() > 0) {
			objExecucao.setInt(3, objColaborador.getId());
		}
		
		objExecucao.executeUpdate();

		// DESCONECTANDO DO BANCO
		objBanco.desconectar();
	}
	
	public void despersistir(Colaborador objColaborador) throws Exception {
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("DELETE FROM COL_COLABORADOR" +
																"WHERE COL_ID = ?");
		objExecucao.setInt(1, objColaborador.getId());
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}