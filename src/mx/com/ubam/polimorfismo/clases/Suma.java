package mx.com.ubam.polimorfismo.clases;
public class Suma {
	private int a;
	private int b;
	private String cad1;
	private String cad2;
	private double d1;
	private double d2;
	
	public int sumar() {
		 this.a=10;
		 this.b=9;
		 return a+b;
	}
	public int sumar(int a, int b) {
		 this.a=a;
		 this.b=b;
		 return a+b;
	}
	public String sumar(String cad1, String cad2) {
		 this.cad1=cad1;
		 this.cad2=cad2;
		 return this.cad1+this.cad2;
	}
	public double sumar(double d1, double d2) {
		this.d1=d1;
		this.d2=d2;
		return d1+d2;
	}
}
