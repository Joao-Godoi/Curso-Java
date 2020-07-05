import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int x = 10;
		double y = 21.1234;
		String nome = "João";
		int idade = 17;
		double sal = 5000.00;
		
		System.out.println("Hello World");
		
		System.out.println(x);
		
		System.out.printf("%.2f\n", y);
		
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros \n", y);
		
		System.out.printf("%s tem %d anos e recebe R$%.2f \n", nome, idade, sal);
	}

}
