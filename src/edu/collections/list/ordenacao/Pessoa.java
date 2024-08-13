package edu.collections.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

	private String nomeDaPessoa;
	private int idadeDaPessoa;
	private double alturaDaPessoa;

	public Pessoa(String nomeDaPessoa, int idadeDaPessoa, double alturaDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
		this.idadeDaPessoa = idadeDaPessoa;
		this.alturaDaPessoa = alturaDaPessoa;
	}

	public Pessoa() {
	}

	@Override
	public String toString() {
		return "Nome: " + nomeDaPessoa + ", Idade: " + idadeDaPessoa + ", Altura: " + alturaDaPessoa;
	}

	public String getNomeDaPessoa() {
		return nomeDaPessoa;
	}

	public void setNomeDaPessoa(String nomeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
	}

	public int getIdadeDaPessoa() {
		return idadeDaPessoa;
	}

	public void setIdadeDaPessoa(int idadeDaPessoa) {
		this.idadeDaPessoa = idadeDaPessoa;
	}

	public double getAlturaDaPessoa() {
		return alturaDaPessoa;
	}

	public void setAlturaDaPessoa(double alturaDaPessoa) {
		this.alturaDaPessoa = alturaDaPessoa;
	}

	@Override
	public int compareTo(Pessoa pessoa) {

		return Integer.compare(idadeDaPessoa, pessoa.getIdadeDaPessoa());
	}

}

class ComparatorPorAltura implements Comparator<Pessoa> {
	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAlturaDaPessoa(), p2.getAlturaDaPessoa());
	}
}
