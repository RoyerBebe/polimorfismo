package mx.com.ubam.polimorfismo.juego;

public class Maquina extends Jugador {
	
	 public Maquina(String nombre) {
		 super(nombre);
	   }
	 public void hacerTiro(Tirada tiro) {
			System.out.println("Maquina tira: \n");
			tiro.tirar();
		}
}
