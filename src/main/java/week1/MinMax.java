/*
Java ile klavyeden girilen N tane sayma sayısından
en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
*/

package week1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Kullanıcının gireceği sayı adedine göre dizi oluşturulur
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int number  = scanner.nextInt();
        int[] numbers = new int[number];

        // Kullanıcıdan sayılar alınır ve diziye kaydedilir
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) + ". Sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        // En büyük ve en küçük değerler bulunur
        int min = numbers[0], max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            } else if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        // Sonuç yazdırılır.
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        scanner.close();
    }
}
