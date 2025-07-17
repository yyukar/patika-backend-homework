/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
*/

package week1;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılı alınır
        System.out.println("Doğum Yılınızı Giriniz :");
        int birthDate = scanner.nextInt();

        // Girdi kontrolü
        if (birthDate < 0) {
            System.out.println("Lütfen pozitif değerler giriniz.");
            scanner.close();
            return;
        }

        // Çin Zodyağı için 12'ye göre mod alınır
        int calculate = birthDate %12;

        // Mod sonucuna göre Çin Zodyağı burcu belirlenir
        switch (calculate) {
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : Koyun");
                break;
            default:
                System.out.println("Geçersiz yıl girdiniz.");
        }

        scanner.close();
    }
}
