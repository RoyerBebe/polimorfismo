package mx.com.ubam.polimorfismo.clases;

public class CuentaBancaria {

	private String numCuenta;
	private String idTitular;
	private double saldo;
	public CuentaBancaria(String numCuenta, String idTitular, double saldo) {
		this.numCuenta = numCuenta;
		this.idTitular = idTitular;
		this.saldo = saldo;
	}
	public CuentaBancaria() {
		System.out.println("Una Cuenta sin datos");
	}
	public CuentaBancaria(String numCuenta) {
		this.numCuenta=numCuenta;
		idTitular = "15487";
		saldo = 256200.98;
	}
}
