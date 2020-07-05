package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Pedro");
		list.add("Ana");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		ent.close();
		
		
	}

}
