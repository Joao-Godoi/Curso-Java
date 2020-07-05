import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int cod, qtd;
		double total;
		
		cod = ent.nextInt();
		qtd = ent.nextInt();
		
		if (cod == 1) {
			total = qtd * 4.00;
		}
		
		else if (cod == 2) {
			total = qtd * 4.50;
		}
		
		else if (cod == 3) {
			total = qtd * 5.00;
		}
		
		else if (cod == 4) {
			total = qtd * 2.00;
		}
		
		else {
			total = qtd * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		ent.close();
	}

}
