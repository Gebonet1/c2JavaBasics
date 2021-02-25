package exCustomizada;
import java.io.IOException;
import java.util.Random;
import exCustomizada.exCustomizada;
public class Ex_3App {
	
    
	static Random rd = new Random();
 
 public static void main(String args[]) {
	 int  numeroAleatorio= rd.nextInt(900);
	 System.out.println("El numero aleatorio es :"+numeroAleatorio);
	 try{
			if(numeroAleatorio%2==0){ throw new exCustomizada(111);}
		
		}catch(exCustomizada ex ) {
			System.out.println(ex.getMessage());
		}
	 

 }
 
 
 
}
 
 
 
	/*public Ex_3() throws IOException {
		this.numeroAleatorio=numeroAleatorio;
		exCustomizada e= new exCustomizada();
		esPar(numeroAleatorio);*/
	

