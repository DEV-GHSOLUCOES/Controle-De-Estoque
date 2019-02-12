
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com os dados do Produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o numero a ser adicionado ao estoque: ");
		quantidade = sc.nextInt();
		
		produto.addProdutos(quantidade);
		System.out.println();
		
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		
		System.out.print("Entre com o numero a ser removido do estoque ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		
		sc.close();
	}
}
