package week2.mathPow;

import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban sayısı alınır
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        double number = scanner.nextDouble();

        // Kullanıcıdan üs değeri alınır
        System.out.print("Üs değerini giriniz: ");
        double exponent = scanner.nextDouble();

        // Math.pow alternatif | START
        if (exponent % 1 != 0) {
            System.out.println("Sonuç: " + Math.pow(number,exponent));
            scanner.close();
            return;
        }
        // Math.pow alternatif | END

        // Tam sayı üs değeri için özel metot kullanılır ve yazdırılır
        System.out.println("Sonuç: " + calculateMathPow(number, exponent));
        scanner.close();
    }

    /**
     * Verilen sayının üssünü hesaplayan metot
     *
     * @param number   Taban sayı
     * @param exponent Üs değeri
     * @return Üs alma işleminin sonucu
     */
    public static double calculateMathPow(double number, double exponent){
        double sum= 1.0;
        if (exponent > 0){
            for (int i = 0; i < exponent; i++) {
                sum *= number;
            }
            return sum;
        } else if (exponent < 0) {
            exponent = -1 * exponent;
            for (int i = 0; i < exponent; i++) {
                sum *= number;
            }
            return 1.0 /sum;
        } else {
            return sum;
        }
    }
}
