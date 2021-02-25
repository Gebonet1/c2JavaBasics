package exCustomizada;
import java.io.IOException;


public class exCustomizada extends Exception {
	public int numeroError;
	public exCustomizada(int codigoError) {
    super();
	this.numeroError=codigoError;	
	}
	
 public String getMessage() {
	 
String mensaje="";

switch(numeroError) {
case 111:
	mensaje="Exception 111: El numero indicado es impar";
case 112:
	mensaje="Exception 112:El numero indicado es par";
}


return mensaje;
 }


}
