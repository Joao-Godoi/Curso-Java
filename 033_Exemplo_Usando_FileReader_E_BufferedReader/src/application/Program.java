package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main (String[] args) {
		
		String path = "c:\\temp\\in.txt"; //Cria uma string com o caminho do arquivo
		FileReader fileReader = null; //Instancia um filereader vazio
		BufferedReader bufferedReader = null; //Instancia um bufferedread vazio
		
		try {
			fileReader = new FileReader(path); //Passa o caminho do arquivo para o filereader
			bufferedReader = new BufferedReader(fileReader); //Passa o filereader para o bufferedread
			
			String line = bufferedReader.readLine(); //Le a linha do arquivo
			
			while (line != null) { //Enquanto ter linha com caracter vai imprimir essa linha 
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();;
			}
		}
		
	}

}
