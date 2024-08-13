package edu.collections.list.pesquisa;

public class Livro {

	private String tituloDoLivro;
	private String autorDoLivro;
	private int anoDePublicacao;

	public Livro() {
	}

	public Livro(String tituloLivro, String autorLivro, int anoPublicacao) {

		this.tituloDoLivro = tituloLivro;
		this.autorDoLivro = autorLivro;
		this.anoDePublicacao = anoPublicacao;
	}

	public String getTituloLivro() {
		return tituloDoLivro;
	}

	public void setTituloLivro(String tituloLivro) {
		this.tituloDoLivro = tituloLivro;
	}

	public String getAutorLivro() {
		return autorDoLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorDoLivro = autorLivro;
	}

	public int getAnoPublicacao() {
		return anoDePublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoDePublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "Título: " + tituloDoLivro + ", Autor: " + autorDoLivro + ", Ano da publicação: " + anoDePublicacao;
	}
	
	

}
