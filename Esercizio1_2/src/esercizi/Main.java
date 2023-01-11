package esercizi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo primo = new Rettangolo(10 , 40.4);
		Rettangolo secondo = new Rettangolo (30 , 60.7);
		stampaRettangolo(primo);
		stampaRettangolo(secondo);
		
	
	}

	static void stampaRettangolo(Rettangolo rettangolo) {
		//stampa AREA
		System.out.println("Area del rettangolo e " + rettangolo.calcoloArea());
		
       //stampa perimetro 
		System.out.println("Perimetro del rettangolo e " + rettangolo.calcoloPerimetro());
	}
}
