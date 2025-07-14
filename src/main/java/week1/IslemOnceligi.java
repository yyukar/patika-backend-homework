package week1;

import java.util.Scanner;

public class IslemOnceligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("birinci sayiyi giriniz:");
        int a = scanner.nextInt();

        System.out.println("ikinci sayiyi giriniz:");
        int b = scanner.nextInt();

        System.out.println("ucuncu sayiyi giriniz: ");
        int c = scanner.nextInt();

        if(a<=0 || b<=0 || c<=0 ) {
            System.out.println("Lütfen pozitif sayılar giriniz!");
            return;
        }

        int sonuc = a+(b*c)-b;

        System.out.println("sonuc : " + sonuc);
    }
}
