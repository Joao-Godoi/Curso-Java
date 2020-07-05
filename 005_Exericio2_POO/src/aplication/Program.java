package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = ent.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = ent.nextDouble();
		System.out.print("Tax: ");
		emp.tax = ent.nextDouble();
		
		System.out.println("");
		System.out.println("Employee: " + emp);
		System.out.println("");
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = ent.nextDouble();
		emp.increasSalary(percentage);
		
		System.out.println("");
		System.out.println("Update data: " + emp);
		
		ent.close();
	}

}
