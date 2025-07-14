package week1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz :");
        int date = scanner.nextInt();
        if (date<1) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }
        if((date % 4 ==0) && date % 100 != 0 || (date % 400 == 0)) {
            System.out.println(date + " bir artık yıldır !");
        }else {
            System.out.println(date + "bir artık yıl değildir!");
        }
    }
}
