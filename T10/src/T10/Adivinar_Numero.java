package T10;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinar_Numero {
	/**
	 * @return the numero
	 */
	protected int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	protected void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the intentos
	 */
	protected int getIntentos() {
		return intentos;
	}

	/**
	 * @param intentos the intentos to set
	 */
	protected void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	Random r = new Random();
	private int numeroAdivinar;
	private int numero;
	private int intentos;
	private Scanner scan = new Scanner(System.in);

	public Adivinar_Numero() {
		numeroAdivinar = r.nextInt(1);

		do {
			comprovarNumero(numero, numeroAdivinar, intentos);
		} while (numero != numeroAdivinar);

	}

	public int getNumeroAdivinar() {
		return numeroAdivinar;
	}

	public void setNumeroAdivinar(int numeroAdivinar) {
		this.numeroAdivinar = numeroAdivinar;
	}

	private void comprovarNumero(int numero, int numeroAdivinar, int intentos) {

		boolean i = false;
		do {
			System.out.println("Introduzca un numero 1-500");
			try {
				numero = scan.nextInt();
				System.out.println("El numero introducido es:" + numero);
				i = true;
				if (i = true && numero < numeroAdivinar) {
					System.out.println("El numero es mayor. Sigue intentandolo");
					intentos++;
				} else if (i = true && numero > numeroAdivinar) {
					System.out.println("El numero es menor. Sigue intentando");
					intentos++;
				} else if (i=true) {
					intentos++;
					 System.out.println("Enorabona has encertat!!!");
					System.out.println("Has en certat amb" + (intentos) + "intents");
				}

			} catch (InputMismatchException ex) {
				System.out.println(ex+"   Introduce un numero entero");
				scan.next();
				i=false;
		      	if (i = false) {
				intentos++;
			}}

		} while (numero != numeroAdivinar);

	}

	/*private void mayorOmenor(int numero, int numeroAdivinar, int intentos) {
		if (numero < numeroAdivinar) {
			System.out.println("El numero es mayor. Sigue intentandolo");
			intentos++;
		} else if (numero > numeroAdivinar) {
			System.out.println("El numero es menor. Sigue intentando");
			intentos++;
		}else {
			System.out.println("Enorabona has encertat!!!");*/
		


	}
          	
	/* private void AcertarDecirIntentos(int intentos) {
		      this.intentos=intentos;
			 System.out.println("Has en certat amb"+intentos+"intents");*/
		 
		  
	  

	
	
	


