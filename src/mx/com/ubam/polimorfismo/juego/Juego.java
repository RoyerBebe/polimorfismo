package mx.com.ubam.polimorfismo.juego;

import java.util.Random;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		   Jugador u=new Usuario("Rogelio");
		   Jugador m=new Maquina("La compu");
		   Scanner sc=new Scanner(System.in);
		   int opUsuario;
		   int opMaquina;
	System.out.println("Hola: " + u.getNombre() + " Elije tu opcion: ");	  
	System.out.println("1.- Piedra\n 2.- Papel\n 3. Tijera\n");
         opUsuario=sc.nextInt();
         if(opUsuario==1) u.hacerTiro(new Piedra());
         else if(opUsuario==2) u.hacerTiro(new Papel());
         else if(opUsuario==3) u.hacerTiro(new Tijera());
         
    System.out.println("Turno de la maquina que se llama..." + m.getNombre());
    opMaquina=(int)(Math.random()*3+1);
    
    
    if(opMaquina==1) m.hacerTiro(new Piedra());
    else if(opMaquina==2) m.hacerTiro(new Papel());
    else if(opMaquina==3) m.hacerTiro(new Tijera());       

	}

}
