/**
 * 
 */
package main;

import javax.swing.JOptionPane;

import models.Password;

/**
 * @author Civerneitor
 *
 */
public class claseEjecutableApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero de contrase�as a generar"));
			Password contras[] = new Password[n];
			int l = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de las contrase�as a generar"));
			boolean fuertes[] = new boolean[n];
			for(int i=0; i<n;i++) {
				contras[i]= new Password(l);
				if(contras[i].esFuerte()) {
					fuertes[i]=true;
				}else fuertes[i]=false;
				System.out.println(contras[i].getContrase�a()+" "+fuertes[i]);
		}
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}
