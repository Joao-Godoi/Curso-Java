package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		Student stu = new Student();
		
		stu.name = ent.nextLine();
		stu.n1 = ent.nextDouble();
		stu.n2 = ent.nextDouble();
		stu.n3 = ent.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", stu.nota());
		System.out.printf(stu.situation());
		
		ent.close();
	}

}
