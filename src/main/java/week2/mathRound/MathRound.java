package week2.mathRound;

import java.util.Scanner;

public class MathRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ondalıklı bir sayı alınır
        System.out.println("ondalikli sayi giriniz");
        double input = scanner.nextDouble();

        // Yuvarlama işlemleri
        int inputFloor = (int) Math.floor(input);
        int inputCeil = (int) Math.ceil(input);
        int inputRound = (int) Math.round(input);

        // Sonuçlar yazdırılır
        System.out.println("Aşağı Yuvarlama: " + inputFloor);
        System.out.println("Yukarı Yuvarlama: " + inputCeil);
        System.out.println("En Yakın Tam Sayı: " + inputRound);

        scanner.close();
    }
}
