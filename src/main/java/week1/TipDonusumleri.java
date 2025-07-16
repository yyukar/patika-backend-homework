package week1;

import java.util.Scanner;

public class TipDonusumleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz: ");
        int myInt = scanner.nextInt();
        System.out.println("bir ondalikli sayi giriniz: ");
        double myDouble = scanner.nextDouble();

        int doubleToInt = (int) myDouble;
        double intToDouble = myInt;

        System.out.println("Tam sayıdan ondalıklı sayıya dönüşmüş hali: " + intToDouble);
        System.out.println("Ondalıklı sayıdan tam sayıya dönüşmüş hali: " + doubleToInt);
    }
}
