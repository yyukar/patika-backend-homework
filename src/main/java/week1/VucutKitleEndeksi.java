/*
 Vücut Kitle İndeksi Hesaplama

 Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
 Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeksi" değerini hesaplayıp ekrana yazdırın.

 Formül:
 Kilo (kg) / (Boy(m) * Boy(m))
*/

package week1;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boy bilgisi alınır
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double height = scanner.nextDouble();

        // Kullanıcıdan kilo bilgisi alınır
        System.out.print("Lütfen kilonuzu giriniz: ");
        int weight = scanner.nextInt();

        // Geçerli giriş kontrolü
        if (height <= 0 || weight <= 0) {
            System.out.println("Lütfen pozitif değerler giriniz.");
            scanner.close();
            return;
        }

        // Vücut kitle indeksi hesaplanır,vki değişkenine atanır.
        double vki = weight / (height * height);

        // Sonuç ekrana yazdırılır.
        System.out.println("Vücut Kitle İndeksiniz : " + vki);

        scanner.close();
    }
}
