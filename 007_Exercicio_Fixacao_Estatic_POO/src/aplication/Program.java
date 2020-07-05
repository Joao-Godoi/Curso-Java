package aplication;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Preço do dolar: ");
		double price = ent.nextDouble();
		System.out.print("Qaunto em dolar vai comprar: ");
		double compra = ent.nextDouble();
		
		System.out.printf("Vai pagar em reais: %.2f%n", CurrencyConverter.convert(price, compra));
		
		ent.close();
	}

}
