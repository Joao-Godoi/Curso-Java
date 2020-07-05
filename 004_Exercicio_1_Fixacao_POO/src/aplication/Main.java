package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		rectangle retan = new rectangle();
		
		System.out.println("Enter rectangle width and height:");
		retan.width = ent.nextDouble();
		retan.height = ent.nextDouble();
		
		System.out.printf("Area = %.2f%n", retan.area());
		System.out.printf("Perimeter = %.2f%n", retan.perimeter());
		System.out.printf("Diagonal = %.2f%n", retan.diagonal());
		
		ent.close();
	}

}
