package Exercicis;

import javax.swing.JOptionPane;

public class Ex_4App {
	public static void main(String[] args) {
		 String radio=JOptionPane.showInputDialog("Introduce el radio");
		 double radioDouble=Double.parseDouble(radio);
		 double radio_2=Math.pow(radioDouble,2);
		 double resultado=Math.PI*radio_2;
		 
	     JOptionPane.showMessageDialog(null,"El resultado és " +resultado);
     
	}
}
