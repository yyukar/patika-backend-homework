package week3.findLetterGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindLetterGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İsterlere gore arraylist olusturuldu
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"y","u","s","u");

        // Kullanıcıdan 4 defa harf alınacak
        int count =0;
        while (count < 4) {
            System.out.println("Bir harf giriniz");
            count++;

            // Kullanıcının girdiği ilk karakter alınıp string'e çevrilir
            String input = String.valueOf(scanner.next().charAt(0));

            // Girilen harf listede yoksa, harf listeye eklenir
            if(!list.contains(input)) {
                list.add(input);
                System.out.println("Girdiginiz harf listeye eklendi");
            } else {
                // Girilen harf listede varsa, eşleşen tüm elemanlar "found" ile değiştirilir
                for (int i =0; i < list.size(); i++) {
                    if (list.get(i).equals(input)) {
                        list.set(i, "found");
                        System.out.println("Harf listede bulundu ve 'found' ile değiştirildi.");
                    }
                }
            }
        }

        // Güncellenmiş liste ekrana yazdırılır
        System.out.println("liste: " + list);
        scanner.close();
    }
}
