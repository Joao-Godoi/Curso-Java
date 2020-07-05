import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		double A, B, C, a, b, c, d, e;
		
		A = ent.nextDouble();
		B = ent.nextDouble();
		C = ent.nextDouble();
		
		a = (A * C) / 2.0; 
		
		b = 3.14159 * C * C;
		
		c = ((A + B) * C) / 2;
		
		d = B * B;
		
		e = A * B;
		
		System.out.println("Áreas");
		System.out.printf("Triangulo: %.3f%n", a);
		System.out.printf("Circulo: %.3f%n", b);
		System.out.printf("Trapezio: %.3f%n", c);
		System.out.printf("Quadrado: %.3f%n", d);
		System.out.printf("Retangulo: %.3f%n", e);
		
		ent.close();
	}

}
