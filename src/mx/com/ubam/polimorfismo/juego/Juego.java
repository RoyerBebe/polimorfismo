package mx.com.ubam.polimorfismo.juego;

import java.util.Random;
import java.util.Scanner;

public class Juego {
	   static Jugador u=new Usuario("Rogelio");
	   static Jugador m=new Maquina("La compu");
	   static Scanner sc=new Scanner(System.in);
	   static int opUsuario;
	   static int opMaquina;

	public static void main(String[] args) {
		   
	jugarUsuario();
    jugarMaquina();   
    checarResultado();

	}
	public static void jugarUsuario() {
		System.out.println("Hola: " + u.getNombre() + " Elije tu opcion:");	  
		System.out.println("1.- Piedra\n2.- Papel\n3. Tijera\n");
		     opUsuario=sc.nextInt();
		     if(opUsuario==1) u.hacerTiro(new Piedra());
		     else if(opUsuario==2) u.hacerTiro(new Papel());
		     else if(opUsuario==3) u.hacerTiro(new Tijera());
	}
	public static void jugarMaquina() {
		System.out.println("Turno de la maquina que se llama..." + m.getNombre());
		opMaquina=(int)(Math.random()*3+1);
		if(opMaquina==1) m.hacerTiro(new Piedra());
		else if(opMaquina==2) m.hacerTiro(new Papel());
		else if(opMaquina==3) m.hacerTiro(new Tijera());
	}

   public static void checarResultado() {
	     if(opUsuario==opMaquina) 
	    	 System.out.println("===Empate===");
	     else if(opUsuario==1 && opMaquina==2)
	    	 System.out.println("===Gana Máquina===");
	     else if(opUsuario==2 && opMaquina==3)
	    	 System.out.println("==Gana Máquina==");
	     else if(opUsuario==3 && opMaquina==1)
	    	 System.out.println("===Gana Maquina===");
	     else if(opUsuario==1 && opMaquina==3)
	    	 System.out.println("===Gana Usuario===");
	     else if(opUsuario==2 && opMaquina==1)
	    	 System.out.println("===Gana Usuario===");
	     else if(opUsuario==3 && opMaquina==2)
	    	 System.out.println("===Gana Usuario===");
   }
	
}
