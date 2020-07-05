package entities;

public class Employee {
	
	private int id;
	private String name;
	private double sal;
	
	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	
	public double aumento(double valor_aum){
		return sal += sal * (valor_aum / 100);
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", sal);
	}

	
}
