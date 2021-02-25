package main;

import javax.swing.JOptionPane;

import models.Calculadora;

public class AritmeticexceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer valor"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo valor"));
		Calculadora calc = new Calculadora(a,b);
		
		//SUMA
		System.out.println("La suma da "+calc.suma());
		//RESTA
		System.out.println("La resta da "+calc.resta());
		//MULTIPICACION
		System.out.println("La multiplicación da "+calc.multiplicacion());
		//DIVISION
		System.out.println("La división da "+calc.division());
		//POTENCIA
		System.out.println("La potencia da "+calc.potencia());
		//RAÍZ CUADRADA
		System.out.println("La raíz cuadrada del primer valor da "+calc.raizCuadrada());
		//RAÍZ CÚBICA
		System.out.println("La raíz cúbica del primer valor da "+calc.raizCubica());
		
		
		//TODO Hay que crear una clase con funciones suma, resta, etc que gentiones las excepciones de la API de Java
	}

}
