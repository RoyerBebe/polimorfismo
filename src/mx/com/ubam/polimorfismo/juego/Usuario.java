package mx.com.ubam.polimorfismo.juego;

public class Usuario extends Jugador {
   
   
   public Usuario(String nombre) {
	 super(nombre);
   }
   public void hacerTiro(Tirada tiro) {
		System.out.println("Usuario tira: \n");
		tiro.tirar();
	}
}
