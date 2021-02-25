package models;

import java.util.Random;

public class Password {

	final private static int DEF_LONGITUD = 8;
	
	private int longitud;
	private String contrase�a;
	
	public Password() {
		this.longitud = DEF_LONGITUD;
		generarPassword();
	}
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		generarPassword();
	}
	public boolean esFuerte() {
		int mayc = 0;//contador de mayusculas
		int minc = 0;//contador de minusculas
		int numc = 0;//contador de n�meros
		for(int i =0;i<longitud;i++) {
			
			char a= contrase�a.charAt(i);
			
			if (a>=65 && a<=90){//Si est� entre los valores 65(A) y 90(Z) ascii inclusive
				mayc++;
			}else if (a>=97 && a<=122){//Si est� entre los valores 97(a) y 122(z) ascii inclusive
				minc++;
			}else if(a>=48 && a<=57){//Si est� entre los valores 48(0) y 57(9) ascii inclusive
				numc++;
			}
		}
		if(mayc>=2 && minc>=1 && numc>=5) return true;
		else return false;
	}
	public void generarPassword() {
		String res = "";
		for(int i =0;i<longitud;i++) {
			int a= new Random().nextInt(93);//caracteres ascii para contrase�as
			char b = (char)a;
			b+=33;//quitamos los 33 primeros caracteres que no nos sirven para contrase�as
			//System.out.println(b);
			res+=b;
		}
		
		this.contrase�a = res;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getLongitud() {
		return longitud;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	
	
}
