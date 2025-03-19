package mx.com.ubam.polimorfismo.juego;

public class Jugador {
	   private String nombre;
	   private Tirada tiro;

	 public Jugador(String nombre) {
		 this.nombre=nombre;
	 }     
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tirada getTiro() {
		return tiro;
	}
	public void setTiro(Tirada tiro) {
		this.tiro = tiro;
	}
	public void hacerTiro(Tirada tiro) {
		System.out.println("Tiro genérico");
	}
	}
