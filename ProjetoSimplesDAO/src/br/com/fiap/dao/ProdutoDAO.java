package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexao.ConexaoFactory;

public class ProdutoDAO {
	
	
	public Connection minhaConexao;

	
	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert
	
	public String inserir(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Insert into T_FIAP_Produto values(?, ?, ?, ?)");
		
		
		//coloca os dados na sql banco de dados
		
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(3, produto.getValor());
		
		
		return "Produto cadastrado com Sucesso!";
	}
	
}
