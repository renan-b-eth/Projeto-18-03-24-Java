package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	
	String conexao = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	String login = "RM553228";
	String senha = "130201";
	
	// metodo conexao
	
	public Connection conexao() throws ClassNotFoundException, SQLException {

		//Driver do banco Oracle
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//faz return da conexao
		return DriverManager.getConnection(conexao,login,senha);
	}
	
}
