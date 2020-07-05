package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		
		System.out.print("How many employees will be registered: ");
		int n = ent.nextInt();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = ent.nextInt();
			System.out.print("Name: ");
			ent.nextLine();
			String name = ent.nextLine();
			System.out.print("Salary: ");
			double sal = ent.nextDouble();
			System.out.println();
			lista.add(new Employee(id, name, sal));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id_aumento = ent.nextInt();
		
		Employee aument = lista.stream().filter(x -> x.getId() == id_aumento).findFirst().orElse(null);
		if (aument == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double valor_aum = ent.nextDouble();
			aument.aumento(valor_aum);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee x : lista) {
			System.out.println(x);
		}
		ent.close();

	}

}
