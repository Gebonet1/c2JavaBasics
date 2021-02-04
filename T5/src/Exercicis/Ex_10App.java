package Exercicis;

import javax.swing.JOptionPane;

public class Ex_10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String numeroVentas=JOptionPane.showInputDialog("Quantas ventas has hecho?");
	int i =Integer.parseInt(numeroVentas);
    int y=0;
    int array1[]= {0,0,0};
	for(int x=0;x<i;++x){
		String importe=JOptionPane.showInputDialog("Importe de la venta?");
		 array1[x] =Integer.parseInt(importe);	
	     y+=array1[x];
	}
	
	System.out.println(y);
	}

}
