package edu.collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;
	
	

	public Set<Produto> getProdutoSet() {
		return produtoSet;
	}

	public void setProdutoSet(Set<Produto> produtoSet) {
		this.produtoSet = produtoSet;
	}

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}

	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}

	// ordenar por nome implementei o Comparable
	public void exibirProdutosPorNome() {
		// por precisar de uma ordem utilizei o TreeSet
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

		if (!produtoSet.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (Produto produto : produtoSet) {
				sb.append(produto).append("\n");
			}
			System.out.println(sb.toString());
			// return produtosPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	//ordenar por preço implementei o Comparator
	public void exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		if (!produtoSet.isEmpty()) {
			produtosPorPreco.addAll(produtoSet);
			
			StringBuilder sb = new StringBuilder();
			for (Produto produto : produtoSet) {
				sb.append(produto).append("\n");
			}
			System.out.println(sb.toString());
			// return produtosPorPreco;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
}
