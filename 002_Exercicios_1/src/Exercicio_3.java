import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.print("A: ");
		a = ent.nextInt();
		
		System.out.print("B: ");
		b = ent.nextInt();
		
		System.out.print("C: ");
		c = ent.nextInt();
		
		System.out.print("D: ");
		d = ent.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.println("Diferença: " + dif);
		
		ent.close();
	}

}
