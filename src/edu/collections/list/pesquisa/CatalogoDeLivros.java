package edu.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {

	private List<Livro> catalogoDeLivros;

	public CatalogoDeLivros() {
		this.catalogoDeLivros = new ArrayList<Livro>();
	}

	public void adicionarLivroNoCatalogo(Livro novoLivro) {
		Livro livro = new Livro(novoLivro.getTituloLivro(), novoLivro.getAutorLivro(), novoLivro.getAnoPublicacao());
		catalogoDeLivros.add(livro);
	}

	public void listarCatalogoDeLivros() {
		if (!catalogoDeLivros.isEmpty()) {

			StringBuilder sb = new StringBuilder();

			for (Livro livro : catalogoDeLivros) {
				sb.append(livro.toString()).append("\n");
			}

			System.out.println(sb.toString());

		} else {
			System.out.println("O catálogo está vazio!");
		}

	}

	public void removerLivroDoCatalogo(String titulo) {

		List<Livro> livrosParaRemover = new ArrayList<>();

		if (!catalogoDeLivros.isEmpty()) {
			for (Livro livro : catalogoDeLivros) {

				if (livro.getTituloLivro().equalsIgnoreCase(titulo)) {
					livrosParaRemover.add(livro);
				}
			}

			catalogoDeLivros.removeAll(livrosParaRemover);

		} else {
			System.out.println("O catálogo está vazio!");
		}
	}

	public List<Livro> pesquisarPorAutor(String autor) {

		List<Livro> livrosPorAutor = new ArrayList<>();

		if (!catalogoDeLivros.isEmpty()) {
			for (Livro livro : catalogoDeLivros) {
				if (livro.getAutorLivro().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
			return livrosPorAutor;
		} else {
			throw new RuntimeException("O catálogo está vazio!");
		}
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

		if (!catalogoDeLivros.isEmpty()) {
			for (Livro livro : catalogoDeLivros) {
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(livro);
				}
			}
			return livrosPorIntervaloAnos;
		} else {
			throw new RuntimeException("O catálogo está vazio!");
		}
	}
	
	  public Livro pesquisarPorTitulo(String titulo) {
		  
		    Livro livroPorTitulo = null;
		    
		    if (!catalogoDeLivros.isEmpty()) {
		      for (Livro livro : catalogoDeLivros) {
		        if (livro.getTituloLivro().equalsIgnoreCase(titulo)) {
		          livroPorTitulo = livro;
		          break;
		        }
		      }
		      return livroPorTitulo;
		    } else {
		      throw new RuntimeException("O catálogo está vazio!");
		    }
		  }

}
