package esercizio;

public class Main {
	
	public static void main(String[] args){
		Sim cellulare = new Sim("3469441602");
		
		cellulare.setCredito(0);
		
		
		Chiamata chiamata = new Chiamata ("3398734567" , 8);
		cellulare.getListaChiamate()[0] = chiamata;
		
	    chiamata = new Chiamata ("3340000987" , 5);
		cellulare.getListaChiamate()[1] = chiamata;
		
		
		 chiamata = new Chiamata ("3380987000" , 3);
		cellulare.getListaChiamate()[2] = chiamata;
		
		
		 chiamata = new Chiamata ("331678903" , 6);
		cellulare.getListaChiamate()[3] = chiamata;
		
		
		chiamata = new Chiamata ("3667890876" , 9);
		cellulare.getListaChiamate()[4] = chiamata;
		
		cellulare.stampaDati();
	}

}
 