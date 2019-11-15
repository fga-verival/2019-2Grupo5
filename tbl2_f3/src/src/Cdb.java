package src;

public class Cdb {
	private int dias;
	private float capitalInicial;
	private float taxa;
	private float aliquota;
	
	public Cdb(int dias,float capitalInicial,float taxa) {
		this.dias = dias;
		this.capitalInicial = capitalInicial;
		this.taxa = taxa/100;
		if(dias <= 180) {
			this.aliquota = 22.5f/100f;
		} else if (dias <= 360) {
			this.aliquota = 20.0f/100f;
		} else if (dias <= 720) {
			this.aliquota = 17.5f/100f;
		} else {
			this.aliquota = 15.0f/100f;
		}
	}
	
	public float getRendimentoBruto() {
		float result = this.capitalInicial * this.taxa * (this.dias/365.0f);
		return result;
	}
	
	public float getImpostoRenda() {
		return this.getRendimentoBruto() * this.aliquota;
	}
}
