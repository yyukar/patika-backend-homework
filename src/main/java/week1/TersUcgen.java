/*

Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile
ekrana ters üçgen çizen programı yazın.
 */

package week1;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısı alınır
        System.out.println("Basamak sayisini giriniz: ");
        int basamakSayisi = scanner.nextInt();

        // 1. Gösterim: Yıldızlarla aralıksız ters üçgen çizimi
        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j= 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Gösterim: Yıldızlarla aralıklı ters üçgen çizimi
        System.out.println("Alternatif ");
        for (int i = 1; i <= basamakSayisi; i++) {
            for (int j = basamakSayisi; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
