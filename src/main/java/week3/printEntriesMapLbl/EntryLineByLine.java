package week3.printEntriesMapLbl;

import java.util.HashMap;
import java.util.Map;

public class EntryLineByLine {
    public static void main(String[] args) {

        // HashMap<String, Integer> türünde bir Map oluşturuluyor
        Map<String, Integer> scores = new HashMap<>();

        // Map'e 5 farklı öğrenci ve notları ekleniyor
        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Her bir entry (anahtar-değer çifti) ayrı ayrı satırda ekrana yazdırılıyor
        System.out.println("Ali = " + scores.get("Ali"));
        System.out.println("Ayşe = " + scores.get("Ayşe"));
        System.out.println("Mehmet = " + scores.get("Mehmet"));
        System.out.println("Zeynep = " + scores.get("Zeynep"));
        System.out.println("Burak = " + scores.get("Burak"));

        /* alternative
        // Looping through each entry (key-value pair) in the map
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            // entry.getKey() returns the key (name)
            // entry.getValue() returns the value (score)
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
         */

    }
}
