/*

Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının
yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin
transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik
bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği),
A^T (A üzeri T) ile gösterilir.
 */

package week1;

import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matrisin satır ve sütun sayıları alınır
        System.out.print("Kaç satır olsun? ");
        int rows = scanner.nextInt();
        System.out.print("Kaç sütun olsun? ");
        int cols = scanner.nextInt();

        // Matris tanımlanır ve elemanları kullanıcıdan alınır
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Orijinal matris ekrana yazdırılır
        System.out.println("Matris :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matris işlemi
        int[][] matrix2 = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }

        // Transpoz matris ekrana yazdırılır
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
