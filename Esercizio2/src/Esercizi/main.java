package Esercizi;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //MOLTIPLICAZIONE//
		
		int a = 3;
		int b = 7;
		int moltiplicazione = moltiplicazione (a , b);
		System.out.println("Risultato moltiplicazione " + moltiplicazione);
        
		
		// CONCATENAZIONE
		String stringa = "Anish ";
				int numero = 10;
				String concatena = concatena (stringa , numero);
				System.out.println("Nome e numero del giocatore " + concatena);
		
		//AGGIUNTA ARRAY
				String[] inserisciInArray = new String[5];
				inserisciInArray[0] = "primo";
				inserisciInArray[1] = "secondo";
				inserisciInArray[2] = "terzo";
				inserisciInArray[3] = "quarto";
				inserisciInArray[4] = "quinto";
				
				System.out.println(java.util.Arrays.toString(inserisciInArray));
				System.out.println(java.util.Arrays.toString(stampaArray(inserisciInArray)));
	}
	
	public static int moltiplicazione (int a , int b) {
		return (a * b);
	}
	
	public static String concatena (String stringa , int numero) {
         String concatena  = stringa + numero;
         return concatena;
	}
	
	public static String[] stampaArray(String[] arr ) {
		String[] risultato = new String[6];
		risultato[0] = arr[0];
		risultato[1] = arr[1];
		risultato[2] = "sesto";
		risultato[3] = arr[2];
		risultato[4] = arr[3];
		risultato[5] = arr[4];
				
		return risultato;
		
	}
}
