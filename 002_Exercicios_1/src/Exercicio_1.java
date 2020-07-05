import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.print("Primeiro número: ");
		a = ent.nextInt();
		
		System.out.print("Segundo número: ");
		b = ent.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma é: " + soma);
		ent.close();
	}

}
