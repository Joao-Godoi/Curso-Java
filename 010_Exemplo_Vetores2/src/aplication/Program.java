package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		double soma = 0, result = 0;
		
		int n = ent.nextInt();
		Produtos[] vect = new Produtos[n];
		
		for (int i=0; i<n; i++) {
			ent.nextLine();
			String name = ent.nextLine();
			double preco = ent.nextDouble();
			vect[i] = new Produtos(name, preco);
			
		}
		
		for (int i=0; i<n; i++) {
			soma += vect[i].getPreco();
		}
		
		result = soma / n;
		
		System.out.printf("Média dos preços: %.2f", result);
		
		ent.close();

	}

}
