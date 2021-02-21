package cine;
public class Pelicula {
	
	public static String pelicula;
    public static int duracion;
    public static int edadMinima;
    public static String director;
    
	public Pelicula(String pelicula, int duracion, int edadMinima,String director ) {
		Pelicula.pelicula=" Senyor de los anillos ";
		Pelicula.duracion= 240;
		Pelicula.edadMinima= 14;
		Pelicula.director=" Jackson";
		
		}
    
	





	public static String getPelicula() {
		return pelicula;
	}
	public static void setPelicula(String pelicula) {
		Pelicula.pelicula = pelicula;
	}
	public static int getDuracion() {
		return duracion;
	}
	public static void setDuracion(int duracion) {
		Pelicula.duracion = duracion;
	}
	public static int getEdadMinima() {
		return edadMinima;
	}
	public static void setEdadMinima(int edadMinima) {
		Pelicula.edadMinima = edadMinima;
	}
	public static String getDirector() {
		return director;
	}
	public static void setDirector(String director) {
		Pelicula.director = director;
	}




	@Override
	public String toString() {
		return "["+"Pelicula" + pelicula + "duracion" + duracion + " edadminima" + edadMinima+"director"+director
				+ "]";
	}

	
	
	
	
	
}
