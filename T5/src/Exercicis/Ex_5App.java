package Exercicis;

import java.util.Scanner;

public class Ex_5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myObj= new Scanner(System.in);//Creamos el objeto scanner
		System.out.println("di un numero? ");
		int numero=myObj.nextInt();
		if (numero%2==0) {
			System.out.println("El numero és divisible entre 2");
		} else {
			System.out.println("El número no és divisible entre 2");
		}		
	}

}
