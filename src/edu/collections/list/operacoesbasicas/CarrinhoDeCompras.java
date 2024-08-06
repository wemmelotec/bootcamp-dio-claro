package edu.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> listaDeItens;

	public CarrinhoDeCompras() {
		this.listaDeItens = new ArrayList<>();
	}

	public void adicionarItemALista(Item novoItem) {
		// saber se já existe
		// adicionar o item ou aumentar a quantidade
		// listaDeItens.add(novoItem);
		boolean itemExiste = false;

		for (Item item : listaDeItens) {
			if (item.getNomeDoItem().equals(novoItem.getNomeDoItem())) {
				item.setQuantidadeDeItens(item.getQuantidadeDeItens() + novoItem.getQuantidadeDeItens());
				itemExiste = true;
				break;
			}
		}

		if (!itemExiste) {
			listaDeItens.add(novoItem);
		}
	}

	public void removerItemDaLista() {
		// implementar
		
	}

	public Double calcularValorTotal() {
		// implementar
		return 0.5;
	}

	public void exibirItensDoCarrinho() {
		// implementar
		for (Item item : listaDeItens) {
			System.out.println(item);
		}
		// return null;

	}
}
