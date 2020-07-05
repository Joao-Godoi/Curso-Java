package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int n = ent.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = ent.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + cont);
		
		ent.close();

	}

}
