package mx.com.ubam.polimorfismo.juego;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoAlternativo {
	static ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
	static ArrayList<Tirada> tiradas=new ArrayList<Tirada>();
	public static void main(String[] args) {
		
		   Jugador u=new Usuario("Rogelio");
		   Jugador m=new Maquina("La compu");
		   jugadores.add(u);
		   jugadores.add(m);
		   
		   tiradas.add(new Piedra());
		   tiradas.add(new Papel());
		   tiradas.add(new Tijera());
		
		for(Jugador j: jugadores) {
			  System.out.println(j.getNombre());
			  j.hacerTiro(tiradas.get((int)(Math.random()*2+1)));
		}
	}

}
