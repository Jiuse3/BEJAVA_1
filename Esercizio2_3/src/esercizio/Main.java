package esercizio;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner input = new Scanner(System.in);
	        System.out.println("Inserisci un numero");
	        int num = input.nextInt();
	        switch (num) {
	        case 0:
	            System.out.println("zero");
	            break;
	        case 1:
	            System.out.println("uno");
	            break;
	        case 2:
	            System.out.println("due");
	            break;
	        case 3:
	            System.out.println("tre");
	            break;
	        default:
	            System.out.println("errore");
	        }
	        input.close();

	    }

	}




