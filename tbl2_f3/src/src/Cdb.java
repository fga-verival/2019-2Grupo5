package src;

public class Cdb {
	private int dias;
	private float capitalInicial;
	private float taxa;
	
	public Cdb(int dias,float capitalInicial,float taxa) {
		this.dias = dias;
		this.capitalInicial = capitalInicial;
		this.taxa = taxa/100;
	}
	
	public float getRendimentoBruto() {
		float result = this.capitalInicial * this.taxa * (this.dias/365.0f);
		return result;
	}
}
