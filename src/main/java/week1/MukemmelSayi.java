package week1;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int input = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < input ; i++) {
            if (input % i == 0 ){
                sum += i;
            }
        }

        if(sum == input) {
            System.out.println(input + " Mükemmel sayıdır");
        } else {
            System.out.println(input + " Mükemmel sayı değildir.");
        }
    }
}
