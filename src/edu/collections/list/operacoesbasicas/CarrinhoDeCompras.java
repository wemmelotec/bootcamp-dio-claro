package edu.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> listaDeItens;

	public CarrinhoDeCompras() {
		this.listaDeItens = new ArrayList<>();
	}

	public void adicionarItemALista(Item novoItem) {
		Item item = new Item(novoItem.getNomeDoItem(), novoItem.getPrecoDoItem(), novoItem.getQuantidadeDeItens());
		listaDeItens.add(item);
	}

	public void removerItemDaLista(String nome) {

		List<Item> itensParaRemover = new ArrayList<>();

		if (!listaDeItens.isEmpty()) {
			for (Item item : listaDeItens) {

				if (item.getNomeDoItem().equalsIgnoreCase(nome)) {
					itensParaRemover.add(item);
				}
			}

			listaDeItens.removeAll(itensParaRemover);

		} else {
			System.out.println("A lista está vazia!");
		}
	}

	public Double calcularValorTotal() {
		double valorTotal = 0d;
		
		if (!listaDeItens.isEmpty()) {
			for (Item item : listaDeItens) {
				double valorItem = item.getPrecoDoItem() * item.getQuantidadeDeItens();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirItensDoCarrinho() {
		if (!listaDeItens.isEmpty()) {

			StringBuilder sb = new StringBuilder();
			
			for (Item item : listaDeItens) {
				sb.append(item.toString()).append("\n");
			}

			System.out.println(sb.toString());

		} else {
			System.out.println("A lista está vazia!");
		}

	}
}
