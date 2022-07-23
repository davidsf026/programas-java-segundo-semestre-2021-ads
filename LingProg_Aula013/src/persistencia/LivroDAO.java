package persistencia;

import java.sql.PreparedStatement;

import negocio.Livro;

public class LivroDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	
	//MÉTODOS DA CLASSE
	public void persistir(Livro objLivro) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO LIV_LIVRO " +
																  "(LIV_TITULO, LIV_IDAUTOR) " + 
																  "VALUES" +
																  "(?, ?)");
		objExecucao.setString(1, objLivro.getTitulo());
		objExecucao.setInt(2, objLivro.getObjAutor().getId());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
