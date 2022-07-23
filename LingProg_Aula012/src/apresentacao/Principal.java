package apresentacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {
	public static void main(String[] args) throws Exception {
		//ESTABELECIMENTO DA CONEXÃO AO BANCO
		Connection objConexao =	DriverManager.getConnection("jdbc:mysql://localhost:3306/aula12?"
															+ "serverTimezone=UTC&"
															+ "user=root&"
															+ "password=&"
															+ "useSSL=false");
		
		PreparedStatement objExecucao =	objConexao.prepareStatement("INSERT INTO PES_PESSOA" + 
																	"(PES_NOME, PES_ENDERECO, PES_TELEFONE)" +
																	"VALUES" +
																	"(?, ?, ?)");
		
		objExecucao.setString(1, "Junior");
		objExecucao.setString(2, "SHIS Qi 3");
		objExecucao.setString(3, "999995");
		
		objExecucao.executeUpdate();		
	}
}
