package mx.com.ubam.polimorfismo.clases;

public class Principal {

	public static void main(String[] args) {
		Suma miSuma=new Suma();
		System.out.println(miSuma.sumar());
		System.out.println(miSuma.sumar(2,3));
		System.out.println(miSuma.sumar("Hola ", "Mundo"));
		System.out.println(miSuma.sumar(3.1416, 98.25));
	}

}
