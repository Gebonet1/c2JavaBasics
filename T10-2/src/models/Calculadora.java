/**
 * 
 */
package models;

/**
 * @author Civerneitor
 *
 */
public class Calculadora {

	private double a;
	private double b;
	public Calculadora(double a, double b) {
		super();
		try {
			this.a = a;
			this.b = b;
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	public Calculadora() {
		super();
	}
	public double suma() {
		try {
			double res = a+b;
			return res;
		}catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
		
	}
	public double resta() {
		try {
			double res = a-b;
			return res;
		}catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
	}
	public double multiplicacion() {
		try {
			double res = a*b;
			return res;
		}catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
	}
	public double potencia() {
		try {
			double res = Math.pow(a,b);
			return res;
		}catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
	}
	public double raizCuadrada() {
		try {
			double res = Math.sqrt(a);
			return res;
		}catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
	}
	public double raizCubica() {
		try {
			double res = Math.cbrt(a);
			return res;
		}catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
	}
	public double division() {
		try {
			double res = a/b;
			return res;
		}catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
	}
	
}
