package week3.findingTwoClosestNumber;

import java.util.ArrayList;
import java.util.Collections;

public class FindingTwoClosestNumber {
    public static void main(String[] args) {

        // İsterlere göre ArrayList oluşturuldu.
        ArrayList<Integer> integers = new ArrayList<>(10);
        Collections.addAll(integers, 1, 2, 4, 5, 8, 10, 12, 18, 16, 14);

        // En yakın sayı çiftlerini bulmak için metot çağırıldı.
        findingTwoClosestNumber(integers);
    }

    public static void findingTwoClosestNumber(ArrayList<Integer> integers) {

        // Liste küçükten büyüğe sıralandı.
        Collections.sort(integers);

        // Minimum fark bulunur
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < integers.size() - 1; i++) {
            int diff = integers.get(i + 1) - integers.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        // Minimum farka sahip sayı çiftleri yazdırılır
        System.out.println("Birbirine en yakın sayılar:");
        for (int i = 0; i < integers.size() - 1; i++) {
            int diff = integers.get(i + 1) - integers.get(i);
            if (diff == minDiff) {
                System.out.println(integers.get(i) + " ve " + integers.get(i + 1));
            }
        }

        /* Without sort
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                int diff = Math.abs(integers.get(i) - integers.get(j));
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                int diff = Math.abs(integers.get(i) - integers.get(j));
                if (diff == minDiff) {
                    System.out.println(integers.get(i) + " ve " + integers.get(j));
                }
            }
        }
        */
    }
}

