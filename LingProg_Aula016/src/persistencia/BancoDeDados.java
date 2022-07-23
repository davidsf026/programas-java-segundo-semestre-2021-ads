package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	//PROPRIEDADES DA CLASSE
	private Connection objConexao = null;
	
	//M�TODO GET DA CLASSE
	Connection getObjConexao() {
		return objConexao;
	}
	
	//M�TODO PARA CONECTAR NO BANCO
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula16?"
															+ "serverTimezone=UTC&"
															+ "user=root&"
															+ "password=&"
															+ "useSSL=false");
	}
	
	//M�TODO PARA DESCONECTAR DO BANCO
	void desconectar() throws Exception {
		objConexao.close();
	}
}