package week1;

import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz :");
        int distance = scanner.nextInt();
        double sum = distance * 0.10;

        System.out.println("Yaşınızı giriniz :");
        int age = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2 ");
        int travelType = scanner.nextInt();

        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        switch (travelType) {

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
    }
}
