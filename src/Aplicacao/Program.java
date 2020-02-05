package Aplicacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		int [][] mat = new int [n][n];
		for (int c=0;c<n;c++) {
			for(int d=0;d<n;d++) {
				mat[c][d]=leia.nextInt();
			}
		}
		System.out.println("Diagonal Principal: ");
		for(int cc=0; cc<=n;cc++) {
			System.out.println(mat[cc][cc]);
		}
	
leia.close();
	}
	
}
