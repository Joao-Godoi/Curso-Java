package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.Contributors;
import entities.IndividualPerson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contributors> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double helthExpenditures = sc.nextDouble();
				list.add(new IndividualPerson(name, annualIncome, helthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new CompanyPerson(name, annualIncome, employees));
			}
		}
		
		System.out.println();
		System.out.println("Taxes Paid: ");
		double sum = 0;
		for (Contributors c : list) {
			System.out.println(c.getName() + ": $ " + String.format("%.2f", c.tax()));
			sum += c.tax();
		}
		
		System.out.println();
		System.out.printf("Totl taxes: $ %.2f", sum);
		sc.close();
	}

}
