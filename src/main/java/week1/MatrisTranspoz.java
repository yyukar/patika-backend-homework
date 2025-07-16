package week1;

import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç satır olsun? ");
        int rows = scanner.nextInt();
        System.out.print("Kaç sütun olsun? ");
        int cols = scanner.nextInt();

        // matris olusturma islemi

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // orjinal matris ciktisi

        System.out.println("Matris :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // transpoze islemi

        int[][] matrix2 = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }

        // transpoze matris ciktisi
        System.out.println("Transpoze : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
