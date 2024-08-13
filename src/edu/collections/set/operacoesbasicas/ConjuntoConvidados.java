package edu.collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadosSet;

	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {

		convidadosSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {

		Convidado convidadoParaRemover = null;

		if (!convidadosSet.isEmpty()) {
			for (Convidado c : convidadosSet) {
				if (c.getCodigoConvite() == codigoConvite) {
					convidadoParaRemover = c;
					break;
				}
			}
			convidadosSet.remove(convidadoParaRemover);
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public int contarConvidados() {

		return convidadosSet.size();
	}

	public void exibirConvidados() {
		if (!convidadosSet.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (Convidado convidado : convidadosSet) {
				 sb.append(convidado).append("\n");
			}
			System.out.println(sb.toString());
			//observe que não precisei fazer iteração sobre o conjunto, apenas mandei imprimir ele.
			//System.out.println(convidadosSet);
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}
}
