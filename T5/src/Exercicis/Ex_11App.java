package Exercicis;

import javax.swing.JOptionPane;

public class Ex_11App {
	public static void main(String[] args) {
		String diaSemana=JOptionPane.showInputDialog("Que dia de la semana és?");
		switch(diaSemana){
		case "Lunes":
			diaSemana="Laborable";
			break;
			case "Martes":
				diaSemana="Laborable";
			break;
			case "Miercoles":
				diaSemana="Laborable";
			case "Jueves":
				diaSemana="Laborable";
			break;
			case "Viernes":
				diaSemana="Laborable";
			break;
			case "Sabado":
				diaSemana="Festibo";
			break;
			case "Domingo":
				diaSemana="Festibo";
		    break;
			default:
			break;
			}
		System.out.println(diaSemana);
}

	}