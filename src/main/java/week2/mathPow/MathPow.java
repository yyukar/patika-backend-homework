package week2.mathPow;

import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üst sınır n değeri alınır
        System.out.print("Üst sınırı giriniz (1-10): ");
        int num = scanner.nextInt();

        // Geçerli aralıkta mı kontrolü yapılır
        if (num > 1 && num <= 10) {
            // Çarpım tablosu için iç içe döngü
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.printf("%-4d", i*j);
                }
                System.out.println();
            }

        } else {
            // Hatalı giriş mesajı
            System.out.println("Hatalı giriş: n değeri 1 ile 10 arasında olmalı.");
        }

        scanner.close();
    }
}

/*
package week2.mathPow;

import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban sayısı alınır
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        double base = scanner.nextDouble();

        // Kullanıcıdan üs değeri alınır
        System.out.print("Üs değerini giriniz: ");
        double exponent = scanner.nextDouble();

        // power metodu ile üs hesaplanır ve yazdırılır.
        System.out.println(power(base,exponent));
    }

    /**
     * Verilen sayının üssünü hesaplayan metot
     *
     * @param base   Taban sayı
     * @param exponent Üs değeri
     * @return Üs alma işleminin sonucu
     *
    private static double power(double base, double exponent) {
        if (exponent == 0 ) return 1;
        if (exponent < 0) {
            return (1 / base) * power(base,exponent + 1);
        }
        return base * power(base,exponent - 1);
    }
}

 */


