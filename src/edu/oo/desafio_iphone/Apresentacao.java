package edu.oo.desafio_iphone;

public class Apresentacao {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone("Protótipo");
		
		System.out.println("Apresentando as funcionalidades do reprodutor musical:");
		iphone.tocar();
		iphone.selecionarMusica("Beatles");
		iphone.pausar();
		System.out.println("******************************************************");
		System.out.println("Apresentando as funcionalidades do aparelho telefonico:");
		iphone.ligar("número digitado");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println("******************************************************");
		System.out.println("Apresentando as funcionalidades do navegador web:");
		iphone.exibirPagina("Página web pesquisada");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
	}

}
