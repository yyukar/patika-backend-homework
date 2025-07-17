/*
 Pratik - Aritmetik İşlemler ve İşlem Önceliği
 Soru: Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın.
 İşlem sırası şöyle olsun: a + b * c - b
 İşlem tamamladıktan sonra sonucu ekrana yazdırın.
*/

package week1;

import java.util.Scanner;

public class IslemOnceligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayıları al
        System.out.println("Birinci sayıyı giriniz: ");
        int a = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int b = scanner.nextInt();

        System.out.println("Üçüncü sayıyı giriniz: ");
        int c = scanner.nextInt();

        // Girdi kontrolü
        if(a<=0 || b<=0 || c<=0 ) {
            System.out.println("Lütfen pozitif sayılar giriniz!");
            scanner.close();
            return;
        }

        // İstenen işlem yapılır ve sonuç yazdırılır
        int sonuc = a+(b*c)-b;
        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}
