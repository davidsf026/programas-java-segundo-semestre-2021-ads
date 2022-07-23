package persistencia;

import java.sql.PreparedStatement;
import negocio.Turma;

public class TurmaDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	
	//MÉTODOS DA CLASSE
	public void persistir(Turma objTurma) throws Exception {
		
		//CONECTANDO AO BANCO
		objBanco = new BancoDeDados();
		objBanco.conectar();
		
		//SUBMETER UMA QUERY AO BANCO
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO TUR_TURMA" +
																"(TUR_IDDISCIPLINA, TUR_IDPROFESSOR, TUR_LETRA) " + 
																"VALUES" +
																"(?, ?, ?)");
		
		objExecucao.setInt(1, objTurma.getObjDisciplina().getId());
		objExecucao.setInt(2, objTurma.getObjProfessor().getId());
		objExecucao.setString(3, objTurma.getLetra());
		
		objExecucao.executeUpdate();
		
		//DESCONECTANDO DO BANCO
		objBanco.desconectar();
	}
}
