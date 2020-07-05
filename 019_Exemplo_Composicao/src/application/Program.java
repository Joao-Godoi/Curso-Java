package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = ent.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = ent.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = ent.nextLine();
		
		System.out.print("Base Salary: ");
		double baseSalary = ent.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		//Cria um novo trabalhador, e cria um novo departamento
		
		System.out.print("How many contracts to this worker: ");
		int n = ent.nextInt();
		
		for (int i=1; i<=n; i++) { //Cria o for para adicionar os n contratos 
			System.out.println("Enter contract #" + i + " data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(ent.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = ent.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = ent.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			//Cria um novo contrato e passa como parametro os dados que o usuario passou
			
			worker.addContract(contract);
			//Adiciona esse novo contratos nos contratos do trabalhador
			
			System.out.println();
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = ent.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName()); //Imprime o nome do trabalhador pegando da classe worker
		System.out.println("Department: " + worker.getDepartment().getName()); //Imprime o departamento pegando da classe worker que pega da classe department
		
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));	
		
		ent.close();
	}

}
