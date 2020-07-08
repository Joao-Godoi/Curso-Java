package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String folderPath = sc.nextLine(); //Recebe o caminho da pasta
		
		File path = new File(folderPath); //Cria um file com o caminho
		
		//Cria um vetor vazio do tipo file e lista todas as pastas do caminho informado
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Cria um vetor vazio do tipo file e lista todos os arquivos do caminho informado
		File[] files = path.listFiles(File::isFile);
		System.out.println();
		System.out.println("Files: ");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.print("Nome da nova pasta (colocar \\ antes do nome): ");
		String folderName = sc.nextLine();
		//Cria uma subpasta com o caminho e o nome informado
		boolean success = new File(folderPath + folderName).mkdir();
		System.out.println("Resultado da criação: " + success);
		
		sc.close();
	}

}
