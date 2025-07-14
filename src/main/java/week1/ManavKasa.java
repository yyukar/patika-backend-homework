package week1;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        // Meyveler ve KG Fiyatları | START
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        // Meyveler ve KG Fiyatları | END

        Scanner scanner = new Scanner(System.in);

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

        double toplamTutar = (armutKg * armut) + (elmaKg * elma) + (domatesKg * domates)
                + (muzKg * muz) + (patlicanKg * patlican); // toplam tutar

        System.out.println("Toplam Tutar :" + toplamTutar);

    }
}
