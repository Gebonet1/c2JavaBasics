package Exercicis;

import javax.swing.JOptionPane;

public class EX_12App {
	public static void main(String[] args) {
    int contra=5;
    int intentos=0;
	   int maximo=3;
	  
	   int i=0;
	do {
	    String contraInt1=JOptionPane.showInputDialog("Contraseña?");
	    i=Integer.parseInt(contraInt1);
	    intentos++;
	   
   }while((intentos<maximo)&&( i!=contra));
	
    }
}

