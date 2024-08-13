package edu.collections.list.pesquisa;

public class CatalogoDeLivrosTest {

	public static void main(String[] args) {

		Livro livro1 = new Livro("1985", "George", 1975);
		Livro livro4 = new Livro("A revolução dos bichos", "George", 1983);
		Livro livro2 = new Livro("Sofia", "Sueco", 2000);
		Livro livro3 = new Livro("Uma breve", "Israelense", 2015);

		CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();

		catalogoDeLivros.adicionarLivroNoCatalogo(livro1);
		catalogoDeLivros.adicionarLivroNoCatalogo(livro2);
		catalogoDeLivros.adicionarLivroNoCatalogo(livro3);
		catalogoDeLivros.adicionarLivroNoCatalogo(livro4);
    
		catalogoDeLivros.listarCatalogoDeLivros();

		System.out.println("****************************************");
		// catalogoDeLivros.removerLivroDoCatalogo("1985");
		// catalogoDeLivros.listarCatalogoDeLivros();
		System.out.println("****************************************");	
		System.out.println(catalogoDeLivros.pesquisarPorAutor(""));
		System.out.println("****************************************");	
		System.out.println(catalogoDeLivros.pesquisarPorIntervaloAnos(1975, 2000));
		System.out.println("****************************************");	
		System.out.println(catalogoDeLivros.pesquisarPorTitulo("uma breve"));
		
	}

}
