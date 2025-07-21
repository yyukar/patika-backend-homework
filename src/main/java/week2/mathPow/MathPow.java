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
     */
    private static double power(double base, double exponent) {
        if (exponent == 0 ) return 1;
        if (exponent < 0) {
            return (1 / base) * power(base,exponent + 1);
        }
        return base * power(base,exponent - 1);
    }
}
