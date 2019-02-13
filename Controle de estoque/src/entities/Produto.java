package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
		
	}



	public double totalValorEmEstoque() {
		return preco * quantidade;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return nome + ", $ " 
					+ String.format("%.2f", preco) + ", "
					+ quantidade + " units, Total: $ "
				    + String.format("%.2f", totalValorEmEstoque());
	}
}
