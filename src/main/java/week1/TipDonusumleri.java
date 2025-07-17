/*

Pratik - Tip Dönüşümleri (Casting)

Java'da tip dönüşümlerini anlamak için bir program yazınız. Bu program, öncelikle kullanıcıdan bir tam sayı ve bir
ondalıklı sayı girmesini istesin. Daha sonra bu tam sayıyı ondalıklı sayıya dönüştürerek ve bu ondalıklı sayıyı
tam sayıya dönüştürerek sonuçları ekrana yazdırsın.
 */

package week1;

import java.util.Scanner;

public class TipDonusumleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayılar alınır
        System.out.println("bir tam sayi giriniz: ");
        int myInt = scanner.nextInt();
        System.out.println("bir ondalikli sayi giriniz: ");
        double myDouble = scanner.nextDouble();

        // Ondalıklı sayı tam sayıya dönüştürülür (explicit casting)
        int doubleToInt = (int) myDouble;

        // Tam sayı ondalıklı sayıya dönüştürülür (implicit casting)
        double intToDouble = myInt;

        // Dönüştürme sonuçları ekrana yazdırılır
        System.out.println("Tam sayıdan ondalıklı sayıya dönüşmüş hali: " + intToDouble);
        System.out.println("Ondalıklı sayıdan tam sayıya dönüşmüş hali: " + doubleToInt);

        scanner.close();
    }
}
