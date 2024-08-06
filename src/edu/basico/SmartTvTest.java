package edu.basico;

public class SmartTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv tv = new SmartTv(true, 10, 7);
		
		System.out.println("TV ligada? " + tv.getLigada());
		System.out.println("Canal atual " + tv.getCanal());
		System.out.println("Volume atual " + tv.getVolume());
		
		tv.desligarTv();
		tv.aumertarVolumeDaTv();
		tv.selecionarCanal(5);
		System.out.println("TV ligada? " + tv.getLigada());
		System.out.println("Canal atual " + tv.getCanal());
		System.out.println("Volume atual " + tv.getVolume());
	}

}
