package Aplicacao;

import java.util.Scanner;

public class MatrizesFixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Informe o número de linhas da matriz: ");
		int l = sc.nextInt();
		System.out.println("Informe o número de colunas da matriz: ");
		int c = sc.nextInt();
		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Preencha a primeira com "+c+" numeros");
				mat[i][j] = sc.nextInt();
			}
		}

	sc.close();

}
}