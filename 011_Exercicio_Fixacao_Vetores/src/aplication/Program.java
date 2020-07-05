package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		System.out.print("How many room will be rented: ");
		int estudantes = ent.nextInt();
		Aluguel[] vect = new Aluguel[10];
		
		for (int i=1; i<=estudantes; i++) {
			ent.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = ent.nextLine();
			System.out.print("Email: ");
			String email = ent.nextLine();
			System.out.print("Room: ");
			int number = ent.nextInt();
			vect[number] = new Aluguel(name, email, number);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getQuarto() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
			
		ent.close();
		}

	}

}
