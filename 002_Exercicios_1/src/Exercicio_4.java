import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int num;
		double h, sal_h, sal;
		
		num = ent.nextInt();
		h = ent.nextDouble();
		sal_h = ent.nextDouble();
		
		sal = h * sal_h;
		
		System.out.println("Number: " + num);
		System.out.printf("Salary: U$ %.2f%n", sal);
		
		ent.close();
	}

}
