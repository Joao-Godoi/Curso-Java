package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = ent.nextDouble();
		}
		
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double result = soma / n;
		System.out.printf("A média é: %.2f", result);
		
		ent.close();
	}

}
