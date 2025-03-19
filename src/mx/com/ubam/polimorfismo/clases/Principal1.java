package mx.com.ubam.polimorfismo.clases;

public class Principal1 {

	public static void main(String[] args) {
	instancear(); 
	}

	private static void instancear() {
		CuentaBancaria cb1=new CuentaBancaria();
		CuentaBancaria cb2=new CuentaBancaria("7778", "12548", 29658.35);
		CuentaBancaria cb3=new CuentaBancaria("7779");
	}
}


