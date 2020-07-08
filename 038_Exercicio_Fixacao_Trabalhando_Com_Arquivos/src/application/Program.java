package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		String parentFile = path.getParent();
		
		boolean success = new File(parentFile + "\\out").mkdir(); 
		
		String targetFileStr = parentFile + "\\out\\summary.csv";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
			
			String itemCsv = bufferedReader.readLine();
			while (itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				
				itemCsv = bufferedReader.readLine();
			}
			
			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for (Product product : list) { 
					bufferedWriter.write(product.getName() + "," + String.format("%.2f", product.total())); 
					bufferedWriter.newLine(); 
				}
				
				System.out.println("Created!");
				
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
