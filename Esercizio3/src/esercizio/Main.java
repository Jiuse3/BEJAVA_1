package esercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
        String str = myObj.next();
        System.out.println("Inserisci una stringa");
        String str2 = myObj.next();
        System.out.println("La stringa concatenata è:" + str+str2);
        System.out.println("La stringa concatenata inversa è:" + str2+str);
        myObj.close();

	}

}
