package edu.collections.list.operacoesbasicas;

public class CarrinhoDeComprasTest {

	public static void main(String[] args) {
		
		Item item1 = new Item("arroz", 2.50, 5);
		Item item2 = new Item("arroz", 2.50, 10);
		Item item3 = new Item("feijao", 2.50, 5);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItemALista(item1);
		carrinhoDeCompras.adicionarItemALista(item2);
		carrinhoDeCompras.adicionarItemALista(item3);
		
		carrinhoDeCompras.exibirItensDoCarrinho();
		System.out.println("****************************************");
		
	//	carrinhoDeCompras.removerItemDaLista("Arroz");
		carrinhoDeCompras.removerItemDaLista("Feijao");
		
		carrinhoDeCompras.exibirItensDoCarrinho();
		System.out.println("****************************************");
		System.out.println("Valor total das compras!");
		System.out.println(carrinhoDeCompras.calcularValorTotal());
		
		
	}

}
