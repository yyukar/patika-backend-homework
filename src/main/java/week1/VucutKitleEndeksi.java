package week1;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double height = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        int weight = scanner.nextInt();

        double vki = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
