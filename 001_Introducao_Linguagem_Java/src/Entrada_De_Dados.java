import java.util.Scanner;

public class Entrada_De_Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Digite algo: ");
		x = sc.nextInt();
		System.out.println(x);
		
		sc.close();
	}

}
