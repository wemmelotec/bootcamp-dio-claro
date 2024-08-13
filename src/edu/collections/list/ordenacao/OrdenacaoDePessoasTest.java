package edu.collections.list.ordenacao;

public class OrdenacaoDePessoasTest {

	public static void main(String[] args) {
	
	    OrdenacaoDePessoas ordenacaoPessoas = new OrdenacaoDePessoas();
	    
	    Pessoa pessoa1 = new Pessoa("Alice", 20, 1.56);
	    Pessoa pessoa2 = new Pessoa("Bob", 30, 1.80);
	    Pessoa pessoa3 = new Pessoa("Charlie", 25, 1.70);
	    Pessoa pessoa4 = new Pessoa("David", 17, 1.56);
	    
	    ordenacaoPessoas.adicionarPessoa(pessoa1);
	    ordenacaoPessoas.adicionarPessoa(pessoa2);
	    ordenacaoPessoas.adicionarPessoa(pessoa3);
	    ordenacaoPessoas.adicionarPessoa(pessoa4);

	    // Exibindo a lista de pessoas adicionadas
	    System.out.println(ordenacaoPessoas.getPessoaList());

	    // Ordenando e exibindo por idade
	    System.out.println(ordenacaoPessoas.ordenarPorIdade());

	    // Ordenando e exibindo por altura
	    System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}

}
