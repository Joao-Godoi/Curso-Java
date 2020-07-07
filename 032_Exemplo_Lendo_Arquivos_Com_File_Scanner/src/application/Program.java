package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\in.txt"); //Instancia um file com o caminho do que ja ta criado
		Scanner sc = null; //Cria um scanner vazio
		try {
			sc = new Scanner(file); //Passa o file como parametro para o scanner
			while (sc.hasNextLine()) { //Enquanto tiver uma proxima linha exibe a linha atual
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); //Caso de algum erro na leitura do file
		}
		finally {
			if (sc != null) { //Checa se o scanner e diferente de nulo, se sim fecha ele
				sc.close();
			}
		}

	}

}
