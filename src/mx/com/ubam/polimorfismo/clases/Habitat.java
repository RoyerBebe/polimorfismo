package mx.com.ubam.polimorfismo.clases;

import java.util.ArrayList;

public class Habitat {	 
	public static void main(String[] args) {
		probar();

	}

	public static void probar() {
		Animal gato=new Gato();
		Animal perro=new Perro();
		Animal jirafa=new Jirafa();
		ArrayList<Animal> animales=new ArrayList<Animal>();
		 animales.add(gato);
		 animales.add(perro);
		 animales.add(jirafa);
		for(Animal miAnimal: animales)
			miAnimal.correr();
	}

}

