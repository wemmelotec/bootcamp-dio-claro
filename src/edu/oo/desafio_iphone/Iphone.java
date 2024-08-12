package edu.oo.desafio_iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	private String modeloIphone;

	public Iphone() {

	}

	public Iphone(String modeloIphone) {
		this.modeloIphone = modeloIphone;
	}

	public String getModeloIphone() {
		return modeloIphone;
	}

	public void setModeloIphone(String modeloIphone) {
		this.modeloIphone = modeloIphone;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada " + musica );
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}
	
	
}
