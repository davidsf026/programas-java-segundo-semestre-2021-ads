package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cargo;

public class CargoDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODOS DA CLASSE
	public Collection<Cargo> getTodos() throws Exception {
		ArrayList<Cargo> retorno = new ArrayList<Cargo>();
		
		//CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		//SUBMETER UMA QUERY AO BANCO
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CRG_CARGO");
		objCursor = objExecucao.executeQuery();
		
		//NAVEGAR PELAS LINHAS DAS TABELAS QUE RETORNARAM AO BANCO
		while (objCursor.next()) {
			retorno.add(new Cargo(objCursor.getInt("CRG_ID"),
								  objCursor.getString("CRG_NOME"),
								  objCursor.getDouble("CRG_SALARIO")));
		}
		
		//DESCONECTANDO DO BANCO
		objBanco.desconectar();
		
		return retorno;
	}
	
	public void persistir(Cargo objCargo) throws Exception {

		// CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();

		// SUBMETER UMA QUERY AO BANCO
		if(objCargo.getId() == 0) {
			objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO CMP_COMPRA " + 
																	"(CRG_NOME, CRG_SALARIO) " + 
																	"VALUES" + 
																	"(?, ?)");
			
		} else {
			objExecucao = objBanco.getObjConexao().prepareStatement("UPDATE CMP_COMPRA SET " + 
																	"CRG_NOME = ?, " + 
																	"CRG_SALARIO = ?, " + 
																	"WHERE CRG_ID = ?"); 
		}
		objExecucao.setString(1, objCargo.getNome());
		objExecucao.setDouble(2, objCargo.getSalario());
		if(objCargo.getId() > 0) {
			objExecucao.setInt(3, objCargo.getId());
		}
		
		objExecucao.executeUpdate();

		// DESCONECTANDO DO BANCO
		objBanco.desconectar();
	}
	
	public void despersistir(Cargo objCargo) throws Exception {
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("DELETE FROM CRG_CARGO" +
																"WHERE CRG_ID = ?");
		objExecucao.setInt(1, objCargo.getId());
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}