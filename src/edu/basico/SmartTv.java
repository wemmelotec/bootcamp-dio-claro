package edu.basico;

public class SmartTv {
	
	private Boolean ligada;
	private int canal;
	private int volume;
	
	
	
	public SmartTv(Boolean ligada, int canal, int volume) {
		super();
		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;
	}

	public void ligarTv() {
		ligada = true;
	}
	
	public void desligarTv() {
		ligada = false;
	}
	
	public int aumertarVolumeDaTv() {
		return volume++;
	}
	
	public int diminuirVolumeDaTv() {
		return volume--;
	}
	
	public void proximoCanal() {
		canal ++;
	}
	
	public void canalAnterior() {
		canal --;
	}
	
	public void selecionarCanal(int numeroDoCalnal) {
		canal = numeroDoCalnal;
	}

	public Boolean getLigada() {
		return ligada;
	}

	public void setLigada(Boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
