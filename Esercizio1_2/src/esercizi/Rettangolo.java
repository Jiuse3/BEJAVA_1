package esercizi;

public class Rettangolo {

	double altezza;
	double larghezza;
	
	public Rettangolo (double altezza , double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
				
	}
	public double calcoloPerimetro() {
		double result = (this.altezza + this.larghezza)*2;
		return result;
	}
	public double calcoloArea () {
		double result = (this.altezza * this.larghezza);
		return result;
				
	}


}
