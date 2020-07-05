import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int a, b;
		
		a = ent.nextInt();
		b = ent.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Multiplos");
		}
		
		else {
			System.out.println("Não multiplos");
		}

	}

}
