package edu.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDePessoas {

	private List<Pessoa> pessoaList;

	public OrdenacaoDePessoas() {
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPessoa(Pessoa pessoa) {
		pessoaList.add(new Pessoa(pessoa.getNomeDaPessoa(), pessoa.getIdadeDaPessoa(), pessoa.getAlturaDaPessoa()));
	}

	// Para ordenar por Idade implementei o comparable que ordena apenas uma vez e
	// altera a classe que será ordenada.
	// Ele implementa a interface Comparable e sobreescreve o método compareTo
	public List<Pessoa> ordenarPorIdade() {

		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

		if (!pessoaList.isEmpty()) {
			Collections.sort(pessoasPorIdade);
			return pessoasPorIdade;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	// Para fazer a ordenação pela altura vou implementar outra forma o Caparator
	// que vai precisar de outra classe para realizar a
	// ordenação pelo atributo escolhido
	public List<Pessoa> ordenarPorAltura() {
		
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		
		if (!pessoaList.isEmpty()) {
			Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
			return pessoasPorAltura;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public List<Pessoa> getPessoaList() {
		return pessoaList;
	}

	public void setPessoaList(List<Pessoa> pessoaList) {
		this.pessoaList = pessoaList;
	}
	
	
}
