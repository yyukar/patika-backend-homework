/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

package week1;

import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan girişler alınır
        System.out.println("Mesafeyi km türünden giriniz :");
        int distance = scanner.nextInt();
        double sum = distance * 0.10;

        System.out.println("Yaşınızı giriniz :");
        int age = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2 ");
        int travelType = scanner.nextInt();

        // Geçersiz veri kontrolü
        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            scanner.close();
            return;
        }

        // Yolculuk tipleri ve toplam hesabı
        switch (travelType) {
            // Yolculuk tipi 1: Tek yön
            case 1 :
                if(age < 12 ) {
                    double ageDiscount = sum * 0.5;
                    double sumDiscount = sum - ageDiscount;
                    System.out.println("Toplam Tutar = "+ sumDiscount);
                } else if (age<=24) {
                    double ageDiscount = sum * 0.1;
                    double sumDiscount = sum - ageDiscount;
                    System.out.println("Toplam Tutar = "+ sumDiscount);
                }else if (age>=65) {
                    double ageDiscount = sum * 0.3;
                    double sumDiscount = sum - ageDiscount;
                    System.out.println("Toplam Tutar = "+ sumDiscount);
                } else {
                    System.out.println("Toplam Tutar = "+ sum);
                }
                break;

            // Yolculuk tipi 2: Gidiş-Dönüş
            case 2 :
                if (age <12) {
                    double ageDiscount = sum * 0.5;
                    double sumDiscount = sum - ageDiscount;
                    double travelTypeDiscount = sumDiscount *0.20;
                    double finalSum = (sumDiscount- travelTypeDiscount)*2;
                    System.out.println("Toplam Tutar = "+ finalSum);
                } else if (age<=24) {
                    double ageDiscount = sum * 0.1;
                    double sumDiscount = sum - ageDiscount;
                    double travelTypeDiscount = sumDiscount *0.20;
                    double finalSum = (sumDiscount- travelTypeDiscount)*2;
                    System.out.println("Toplam Tutar = "+ finalSum);
                }else if (age>=65) {
                    double ageDiscount = sum * 0.3;
                    double sumDiscount = sum - ageDiscount;
                    double travelTypeDiscount = sumDiscount *0.20;
                    double finalSum = (sumDiscount- travelTypeDiscount)*2;
                    System.out.println("Toplam Tutar = "+ finalSum);
                } else {
                    double travelTypeDiscount = sum*0.2;
                    double finalSum = (sum - travelTypeDiscount)*2;

                    System.out.println("Toplam Tutar = "+ finalSum);
                }
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz !");
        }

        scanner.close();
    }
}
