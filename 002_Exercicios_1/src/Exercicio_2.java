import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		double r, area;
		
		System.out.print("Raio: ");
		r = ent.nextDouble();
		
		area = 3.14159 * r * r;
		
		System.out.printf("A = %.4f%n", area);
		
		ent.close();

	}

}
