package util;

public class Conta {
	
	private String name;
	private int number;
	private double saldo;
	
	public Conta(int count, String name, double saldo) {
		this.name = name;
		this.number = count;
		this.saldo = saldo;
	}
	
	public Conta(int count, String name) {
		this.name = name;
		this.number = count;
	}

	public int getCount() {
		return number;
	}

	public void setCount(int count) {
		this.number = count;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double deposito(double depo) {
		return saldo += depo;
	}
	
	public double saque(double saq) {
		return saldo -= saq + 5;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", saldo);
	}
	
	
}
