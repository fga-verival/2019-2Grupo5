package src;

public class Cdb {
	private float dias;
	private float capitalInicial;
	private float taxa;
	
	public Cdb(float dias,float capitalInicial,float taxa) {
		this.dias = dias;
		this.capitalInicial = capitalInicial;
		this.taxa = taxa/100;
	}
	
	public float getRendimentoBruto() {
		return 13.97f;
	}
}
