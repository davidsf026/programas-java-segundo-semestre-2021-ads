package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Disciplina;

public class DisciplinaDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODOS DA CLASSE
	public Collection<Disciplina> getTodos() throws Exception {
		ArrayList<Disciplina> retorno = new ArrayList<Disciplina>();
		
		//CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		//SUBMETER UMA QUERY AO BANCO
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM DIS_DISCIPLINA");
		objCursor = objExecucao.executeQuery();
		
		//NAVEGAR PELAS LINHAS DAS TABELAS QUE RETORNARAM AO BANCO
		while (objCursor.next()) {
			retorno.add(new Disciplina(objCursor.getInt("DIS_ID"),
								  objCursor.getString("DIS_NOME")));
		}
		
		//DESCONECTANDO DO BANCO
		objBanco.desconectar();
		
		return retorno;
	}
}
