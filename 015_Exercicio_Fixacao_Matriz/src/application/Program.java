package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int m = ent.nextInt();
		int n = ent.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = ent.nextInt();
			}
		}
		
		int x = ent.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.println("Position: " + i + "," + j);
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][(j-1)]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][(j)]);
					}
					
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[(i)][j+1]);
					}
					
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					System.out.println();
				}
			}
		}
		
		ent.close();

	}

}
