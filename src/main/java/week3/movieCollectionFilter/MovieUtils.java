package week3.movieCollectionFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieUtils {
    // Filmleri filtreleyen metod
    public static void filterByGenre(List<Movie> movies, String targetGenre) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(targetGenre)) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Bu türe ait film bulunamadı: " + targetGenre);
        }
    }

    // IMDb'ye göre büyükten küçüğe sıralama
    public static void printSortedByImdb(List<Movie> movies) {
        List<Movie> sortedList = new ArrayList<>(movies); // Listeyi kopyala
        Comparator<Movie> imdbComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Double.compare(m2.getImdbRating(), m1.getImdbRating());
            }
        };
        Collections.sort(sortedList, imdbComparator); // Sırala
        // Sonuçları yazdır
        System.out.println("IMDb sıralamasına göre sıralama:");
        for (Movie movie : sortedList) {
            System.out.println(movie);
        }
    }

    // Yıla göre sıralama (küçükten büyüğe)
    public static void printSortedByYear(List<Movie> movies) {
        List<Movie> sortedList = new ArrayList<>(movies); // Listeyi kopyala
        Comparator<Movie> yearComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Integer.compare(m1.getYear(), m2.getYear());
            }
        };
        Collections.sort(sortedList, yearComparator); // Sırala
        // Sonuçları yazdır
        System.out.println("Yayın yılına göre sıralama:");
        for (Movie movie : sortedList) {
            System.out.println(movie);
        }
    }
}
