package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	//PROPRIEDADES DA CLASSE
	private Connection objConexao = null;
	
	//MÉTODO GET DA CLASSE
	public Connection getObjConexao() {
		return objConexao;
	}
	
	//MÉTODO PARA CONECTAR NO BANCO
	public void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula13?"
															+ "serverTimezone=UTC&"
															+ "user=root&"
															+ "password=&"
															+ "useSSL=false");
	}
	
	public void desconectar() throws Exception {
		objConexao.close();
	}
}
