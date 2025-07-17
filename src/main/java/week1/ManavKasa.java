/*
 Manav Kasa Programı

 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
 değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

 Ürünler ve Kilogram Fiyatları:
 Armut: 2.14 TL
 Elma: 3.67 TL
 Domates: 1.11 TL
 Muz: 0.95 TL
 Patlıcan: 5.00 TL
*/

package week1;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürünler ve Kilogram Fiyatları
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;

        // Kullanıcıdan alışveriş bilgisi alınır
        System.out.println("Armut Kaç Kilo ? :");
        double armutKg = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        double elmaKg = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? :");
        double domatesKg = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? :");
        double muzKg = scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? :");
        double patlicanKg = scanner.nextDouble();

        // Geçerli giriş kontrolü
        if (armutKg < 0 || elmaKg < 0 || domatesKg < 0 || muzKg < 0 || patlicanKg < 0) {
            System.out.println("Lütfen pozitif değerler giriniz.");
            scanner.close();
            return;
        }

        // Toplam tutar hesaplanır
        double toplamTutar = (armutKg * armut)
                + (elmaKg * elma)
                + (domatesKg * domates)
                + (muzKg * muz)
                + (patlicanKg * patlican);

        // Sonuç ekrana yazdırılır.
        System.out.printf("Toplam Tutar: %.2f TL", toplamTutar);

        scanner.close();
    }
}
