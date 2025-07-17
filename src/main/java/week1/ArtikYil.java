/*
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

Artık Yıl Nedir?

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
*/

package week1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yıl alınır
        System.out.println("Yıl Giriniz :");
        int date = scanner.nextInt();

        // Girdi kontrolü
        if (date<1) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Artık yıl hesaplaması
        if((date % 4 ==0) && date % 100 != 0 || (date % 400 == 0)) {
            System.out.println(date + " bir artık yıldır !");
        }else {
            System.out.println(date + "bir artık yıl değildir!");
        }

        scanner.close();
    }
}
