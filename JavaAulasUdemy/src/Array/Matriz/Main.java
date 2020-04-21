package Array.Matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int matrizColumn = sc.nextInt();
			int matrizRow = sc.nextInt();
			int[][] matriz = new int[matrizColumn][matrizRow];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = sc.nextInt();
				}
			}
			System.out.println("Digite um número da matriz");
			int matrizNumber = sc.nextInt();
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matrizNumber == matriz[i][j]) {
						System.out.printf("Posição %d,%d:"+ i,j);
						if (j > 0) {
							System.out.printf("Esquerda: %d"+matriz[i][j-1]);							
						}
						if (i > 0) {
							System.out.printf("Direita: %d"+matriz[i-1][j]);							
						}
						if (j > matriz[i].length-1) {
							System.out.printf("Esquerda: %d"+matriz[i][j+1]);							
						}
						if (j > matriz.length-1) {
							System.out.printf("Esquerda: %d"+matriz[i+1][j]);							
						}
					}
				}
			}
		sc.close();
	}

}
