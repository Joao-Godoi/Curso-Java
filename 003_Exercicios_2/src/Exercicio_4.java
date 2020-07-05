import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		int horaInicial = ent.nextInt();
		int horaFinal = ent.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		ent.close();
	}

}
