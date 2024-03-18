package br.com.fiap.main;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class CadastroProduto {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner in = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		ProdutoDAO dao = new ProdutoDAO();
		
		produto.setCodigo(in.nextInt());
		produto.setTipo(in.nextLine());
		produto.setMarca(in.nextLine());
		produto.setValor(in.nextDouble());
		
		System.out.println(dao.inserir(produto));
	}

}
