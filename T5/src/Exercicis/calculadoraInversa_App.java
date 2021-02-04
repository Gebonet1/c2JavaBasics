package Exercicis;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class calculadoraInversa_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String operador1=JOptionPane.showInputDialog("Introdueix el primer operador:"); //Demanem el primer operador 
		 double op_1=Double.parseDouble(operador1);
		 String operador2=JOptionPane.showInputDialog("Introdueix el segon operador:");
		 double op_2=Double.parseDouble(operador2);
		 
		/* Object signo = JOptionPane.showInputDialog(null,"Seleccione Un Simbolo",
				   "Signos", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "+","-", "*", "/","^","%" },"Seleccione");*/
			 Scanner myObj = new Scanner(System.in);
			 System.out.println("Que operacion quieres? :1(+),2(-),3(*),4(/),5(^),6()");
			 int resp=myObj.nextInt();
				 if(resp==1){
			     double resultat=op_1+op_2;
			     System.out.println(resultat);
				 }
				 if(resp==2){
				     double resultat=op_1-op_2;
				     System.out.println(resultat);
					 }
				 
				 if(resp==3){
				     double resultat=op_1*op_2;
				     System.out.println(resultat);
					 }
				 
				 if(resp==4){
				     double resultat=op_1/op_2;
				     System.out.println(resultat);
					 }
				 if(resp==5){
				     double resultat=Math.pow(op_1,op_2);
				     System.out.println(resultat);
					 }
				 if(resp==6){
				     double resultat=op_1%op_2;
				     System.out.println(resultat);
					 }
				 
			 
			 
			 }
			 
		   
		}
	

