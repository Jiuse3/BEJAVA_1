package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;
 
//Moltiplicazione

public class Esercizio2 {
	 public static void main(String[] args) {
	        Scanner myObj = new Scanner(System.in);
	        System.out.println("Inserisci due interi:");
	        int num1 = myObj.nextInt();
	        int num2 = myObj.nextInt();
	        System.out.println("Il risultato della moltiplicazione è :"+(num1*num2));
	        
	        //Array
	        
	        int[] a = { 1, 2, 3, 5, 6 };
            System.out.println(Arrays.toString(a));

            System.out.println("Inserisci un numero da mettere al terzo posto dell'array:");
            int key = myObj.nextInt();
            int index = 2;

            a = insert(a, key, index);
            System.out.println(Arrays.toString(a));

}
	 private static int[] insert(int[] a, int key, int index)
	    {
	        int[] result = new int[a.length + 1];
	 
	        for (int i = 0; i < index; i++) {
	            result[i] = a[i];
	        }
	 
	        result[index] = key;
	 
	        for (int i = index + 1; i <= a.length; i++) {
	            result[i] = a[i - 1];
	        }
	 
	        return result;
	    }


	 
	 
}