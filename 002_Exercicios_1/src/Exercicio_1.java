import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.print("Primeiro n�mero: ");
		a = ent.nextInt();
		
		System.out.print("Segundo n�mero: ");
		b = ent.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma �: " + soma);
		ent.close();
	}

}
