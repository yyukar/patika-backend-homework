package week1;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayisini giriniz: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {

            for (int j = basamakSayisi; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
