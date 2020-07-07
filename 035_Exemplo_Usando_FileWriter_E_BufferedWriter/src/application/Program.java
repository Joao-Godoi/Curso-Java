package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void main (String [] args) {
		
		
		String[] lines = new String[] {"Teste 1", "Teste 2", "Teste 3"}; //Cria um vetor com 3 frases
		
		String path = "c:\\temp\\out.txt"; //Cria um string com o caminho onde quer criar o arquivo
		
		//Instancia o bufferedwriter e o filewriter ja no try, nao precisa fechar depois, pois fecha sozinho
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) { //Percorre todo o vetor 
				bufferedWriter.write(line); //Escreve cada elemento do vetor
				bufferedWriter.newLine(); //Da uma quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
		
	}

}
