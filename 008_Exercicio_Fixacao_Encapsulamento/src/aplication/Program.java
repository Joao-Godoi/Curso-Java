package aplication;

import java.util.Locale;
import java.util.Scanner;
import util.Conta;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Numero da conta: ");
		int number = ent.nextInt();
		System.out.print("Nome da conta: ");
		ent.nextLine();
		String name = ent.nextLine();
		System.out.print("Vai ter depósito inicial (s/n): ");
		char resp = ent.next().charAt(0);
		
		
		
		if (resp == 's') {
			System.out.print("Valor do depósito: ");
			double depo = ent.nextDouble();
			conta = new Conta(number, name, depo);
				
		}
		
		else {
			conta = new Conta(number, name);
		}
		
		System.out.println();
		System.out.println("Inoformações da conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Valor do depósito: ");
		double depo = ent.nextDouble();
		conta.deposito(depo);
		
		System.out.println();
		System.out.println("Inoformações da conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Valor do saque: ");
		double saque = ent.nextDouble();
		conta.saque(saque);
		
		System.out.println();
		System.out.println("Inoformações da conta: ");
		System.out.println(conta);
		System.out.println();
	
		ent.close();
		
	}

}