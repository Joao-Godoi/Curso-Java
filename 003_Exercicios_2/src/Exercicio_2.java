import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int n;
		
		n = ent.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}

	}

}
