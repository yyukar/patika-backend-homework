/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
“mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
Mükemmel Sayı Nedir?

Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan
 sayıya mükemmel sayı denir.
 */

package week1;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan pozitif bir tam sayı alınır
        System.out.println("Bir sayı giriniz: ");
        int input = scanner.nextInt();

        // Geçersiz veri kontrolü
        if (input < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            scanner.close();
            return;
        }

        // Bölenlerin toplamı hesaplanır
        int sum = 0;
        for (int i = 1; i < input ; i++) {
            if (input % i == 0 ){
                sum += i;
            }
        }

        // Mükemmel sayı kontrolü
        if(sum == input) {
            System.out.println(input + " Mükemmel sayıdır");
        } else {
            System.out.println(input + " Mükemmel sayı değildir.");
        }

        scanner.close();
    }
}
