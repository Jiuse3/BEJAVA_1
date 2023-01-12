package esercizio;

public class Sim {
	private String numeroTel;
	private double credito;
	private Chiamata[] listaChiamate;

	public Sim(String numero) {
		// TODO Auto-generated constructor stub
		this.numeroTel = numero;
		this.credito = 0;
		this.listaChiamate = new Chiamata[5];

	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public Chiamata[] getListaChiamate() {
		return listaChiamate;
	}

	public void setListaChiamate(Chiamata[] listaChiamate) {
		this.listaChiamate = listaChiamate;
	}

	public void stampaDati() {
        System.out.println("Numero sim: " + this.numeroTel);
        System.out.println("Credito residuo: " + this.credito);
        System.out.println("Lista chiamate del numero " + this.numeroTel);
        System.out.println("- " + listaChiamate[0].getNumeroChiamato() + ", durata " + listaChiamate[0].getDurataMinuti() + " min");
        System.out.println("- " + listaChiamate[1].getNumeroChiamato() + ", durata " + listaChiamate[1].getDurataMinuti() + " min");
    }
}
