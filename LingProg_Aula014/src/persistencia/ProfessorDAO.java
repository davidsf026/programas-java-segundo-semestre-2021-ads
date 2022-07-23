package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Professor;

public class ProfessorDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODOS DA CLASSE
	public Collection<Professor> getTodos() throws Exception {
		ArrayList<Professor> retorno = new ArrayList<Professor>();
		
		//CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		//SUBMETER UMA QUERY AO BANCO
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRF_PROFESSOR");
		objCursor = objExecucao.executeQuery();
		
		//NAVEGAR PELAS LINHAS DAS TABELAS QUE RETORNARAM AO BANCO
		while (objCursor.next()) {
			retorno.add(new Professor(objCursor.getInt("PRF_ID"),
								  	  objCursor.getString("PRF_NOME"),
								  	  objCursor.getString("PRF_TITULACAO")));
		}
		
		//DESCONECTANDO DO BANCO
		objBanco.desconectar();
		
		return retorno;
	}
}
