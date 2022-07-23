package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	//PROPRIEDADES DA CLASSE
	private Connection objConexao = null;
	
	//MÉTODO GET DA CLASSE
	Connection getObjConexao() {
		return objConexao;
	}
	
	//MÉTODO PARA CONECTAR NO BANCO
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula14?"
															+ "serverTimezone=UTC&"
															+ "user=root&"
															+ "password=&"
															+ "useSSL=false");
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}
}