package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Produto;

public class ProdutoDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODOS DA CLASSE
	public Collection<Produto> getTodos() throws Exception {
		ArrayList<Produto> retorno = new ArrayList<Produto>();
		
		//CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		//SUBMETER UMA QUERY AO BANCO
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRD_PRODUTO");
		objCursor = objExecucao.executeQuery();
		
		//NAVEGAR PELAS LINHAS DAS TABELAS QUE RETORNARAM AO BANCO
		while (objCursor.next()) {
			retorno.add(new Produto(objCursor.getInt("PRD_ID"),
								  	  objCursor.getString("PRD_NOME"),
								  	  objCursor.getDouble("PRD_PRECO")));
		}
		
		//DESCONECTANDO DO BANCO
		objBanco.desconectar();
		
		return retorno;
	}
}
