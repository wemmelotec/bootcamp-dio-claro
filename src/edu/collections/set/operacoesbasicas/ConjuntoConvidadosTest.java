package edu.collections.set.operacoesbasicas;

public class ConjuntoConvidadosTest {

	public static void main(String[] args) {

		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

		System.out.println(
				"Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
		
	    conjuntoConvidados.adicionarConvidado("Alice", 1234);
	    conjuntoConvidados.adicionarConvidado("Bob", 1235);
	    conjuntoConvidados.adicionarConvidado("Charlie", 1235);
	    conjuntoConvidados.adicionarConvidado("David", 1236);
	    
	    System.out.println(
				"Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
	    
	    System.out.println("Convidados no conjunto:");
	    conjuntoConvidados.exibirConvidados();
	    
	    conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");
	    
	    System.out.println("Convidados no conjunto:");
	    conjuntoConvidados.exibirConvidados();
	}

}
