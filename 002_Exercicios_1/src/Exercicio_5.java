import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int p1, np1, p2, np2;
		double vp1, vp2, t1, t2, tf;
		
		p1 = ent.nextInt();
		np1 = ent.nextInt();
		vp1 = ent.nextDouble();
		
		p2 = ent.nextInt();
		np2 = ent.nextInt();
		vp2 = ent.nextDouble();
		
		t1 = np1 * vp1;
		t2 = np2 * vp2;
		tf = t1 + t2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", tf);
		
		ent.close();
	}

}
