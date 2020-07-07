package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main (String[] args) {
		
		String path = "c:\\temp\\in.txt";
		
		//Instancia o bufferedreader e o filereader ja no try, nao precisa fechar depois, pois fecha sozinho
		try (BufferedReader bufferedReader = new  BufferedReader(new FileReader(path))){
			String line = bufferedReader.readLine(); //Le cada linha do arquivo
			
			while (line != null) { //Enquanto ter linha com caracter vai imprimir essa linha 
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
