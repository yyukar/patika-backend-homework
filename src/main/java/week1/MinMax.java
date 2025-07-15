package week1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan program

        System.out.println("bir sayi giriniz: ");
        int input = scanner.nextInt();

        for (int i = 0; i <= input; i++) {
            if (i%2==0) {
                System.out.println(i +" bir çift sayi");
            }
        }

        // 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
        // sayıların ortalamasını hesaplayan program

        System.out.println("bir sayı giriniz: ");
        int input2 = scanner.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = 0; i <= input2; i++) {
            if(i % 3 == 0 && i % 4 == 0){
                sum = sum + i;
                count++;
            }
        }
        if(count != 0) {
            double average = sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
