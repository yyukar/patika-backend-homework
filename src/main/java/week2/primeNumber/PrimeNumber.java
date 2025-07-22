package week2.primeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı alınır
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        // Asallık kontrolü yapılır ve sonuç yazdırılır
        if (isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    // Ana asallık kontrol metodu
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        return isPrimeRecursive(n, 3);
    }

    // Recursive yardımcı metot
    private static boolean isPrimeRecursive(int n, int i) {
        if (i > Math.sqrt(n)) return true; // Efficiency trick: think (i > n)
        if (n % i == 0) return false;
        return isPrimeRecursive(n, i + 2);
    }
}
