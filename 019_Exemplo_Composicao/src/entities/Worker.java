package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entities.enums.WorkerLevel;

public class Worker {
//-----------------Instanciacao----------------------//	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department; //Serve para fazer o relacionamento com o department
	private List<HourContract> contracts = new ArrayList<>(); //Serve para criar vários contratos
//-----------------Instanciacao----------------------//
	

//-----------------Construtores----------------------//
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
//-----------------Construtores----------------------//
	

//-----------------get and sets----------------------//	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
//-----------------get and sets----------------------//	
	

//-------------------metodos-------------------------//	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance(); //Cria um calendario vazio
		for (HourContract c : contracts) { //Cria um for para percorrer todos os contratos
			cal.setTime(c.getDate()); //Instancia a data do contrato como a data do calendario
			int c_year = cal.get(Calendar.YEAR); //Cria uma variavel e atribui de valor o ano do contrato
			int c_month = 1 + cal.get(Calendar.MONTH); //Cria uma variavel e atribui a ela o valor do mes do contrato
			
			if (year == c_year && month == c_month) { //se o mes e o ano do contrato for o que o usuario passou entra no if
				sum += c.totalValue();
			}
		}
		return sum;
	}
//-------------------metodos-------------------------//	
}