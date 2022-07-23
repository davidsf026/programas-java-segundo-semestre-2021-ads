package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Autor;

public class AutorDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	public Collection<Autor> getTodos() throws Exception {
		ArrayList<Autor> retorno = new ArrayList<Autor>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM AUT_AUTOR");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Autor(objCursor.getInt("AUT_ID"),
								  objCursor.getString("AUT_NOME")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
}
