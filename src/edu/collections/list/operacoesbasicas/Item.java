package edu.collections.list.operacoesbasicas;

public class Item {
	private String nomeDoItem;
	private Double precoDoItem;
	private int quantidadeDeItens;
	
	public Item(String nomeDoItem, Double precoDoItem, int quantidadeDeItens) {
		this.nomeDoItem = nomeDoItem;
		this.precoDoItem = precoDoItem;
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public Double getPrecoDoItem() {
		return precoDoItem;
	}

	public void setPrecoDoItem(Double precoDoItem) {
		this.precoDoItem = precoDoItem;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}

	@Override
	public String toString() {
		return "Item [nomeDoItem=" + nomeDoItem + ", precoDoItem=" + precoDoItem + ", quantidadeDeItens="
				+ quantidadeDeItens + "]";
	}
	
	
}
