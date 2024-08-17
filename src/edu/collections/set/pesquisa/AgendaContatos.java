package edu.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

import edu.collections.set.operacoesbasicas.Convidado;

public class AgendaContatos {

	private Set<Contato> contatosSet;

	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatosSet.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		if (!contatosSet.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (Contato contato : contatosSet) {
				sb.append(contato).append("\n");
			}
			System.out.println(sb.toString());
			// System.out.println(contatosSet);
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}

	public Set<Contato> pesquisarPorNome(String nome) {

		Set<Contato> contatosPorNome = new HashSet<>();

		if (!contatosSet.isEmpty()) {
			for (Contato c : contatosSet) {
				if (c.getNome().startsWith(nome)) {
					contatosPorNome.add(c);
				}
			}
			return contatosPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		
		Contato contatoAtualizado = null;
		
		if (!contatosSet.isEmpty()) {
			for (Contato c : contatosSet) {
				if (c.getNome().equalsIgnoreCase(nome)) {
					c.setNumero(novoNumero);
					contatoAtualizado = c;
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
}
