package Exercicis;

import javax.swing.JOptionPane;

public class EX_6App {
  public static final double IVA_21=0.21;
	public static void main(String[] args) {
		 String Precio=JOptionPane.showInputDialog("Introduce el precio del producto: ");//Pedimos el precio
		 double PrecioDouble=Double.parseDouble(Precio);//Pasamos a double
		 double PrecioFinal=(PrecioDouble*IVA_21)+PrecioDouble;//Realizamos en un passo el calculo.
		 
		 JOptionPane.showMessageDialog(null,"El precio con IVA és " +PrecioFinal);//Sacamos el precio por pantalla 
} 
} 