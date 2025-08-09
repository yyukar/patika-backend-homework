package week3.movieCollectionFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        // Film koleksiyonu oluşturulur
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("inception",2010,"sci-fi",8.8));
        movieList.add(new Movie("the godfather", 1972, "crime", 9.2));
        movieList.add(new Movie("interstellar", 2014, "sci-fi", 8.6));
        movieList.add(new Movie("pulp fiction", 1994, "crime", 8.6));
        movieList.add(new Movie("titanic", 1997, "romance", 7.8));

        // IMDb sıralaması
        MovieUtils.printSortedByImdb(movieList);
        System.out.println();

        // Yayın yılına göre sıralama
        MovieUtils.printSortedByYear(movieList);
        System.out.println();

        // Filtreleme için input alınır ve ilgili metodlarla yazdırılır
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen filtrelemek istediginiz film turunu giriniz: ");
        String inputGenre = scanner.nextLine();
        MovieUtils.filterByGenre(movieList, inputGenre);
        scanner.close();
    }
}

/* alternative
// IMDb puanına göre büyükten küçüğe sıralama
        System.out.println("IMDb'ye Göre Sıralama (Büyükten Küçüğe):");
        filmler.sort(Comparator.comparingDouble(Film::getImdbPuani).reversed());
        filmler.forEach(System.out::println);

        // Yayın yılına göre küçükten büyüğe sıralama
        System.out.println("\nYayın Yılına Göre Sıralama (Küçükten Büyüğe):");
        filmler.sort(Comparator.comparingInt(Film::getYayinYili));
        filmler.forEach(System.out::println);

        // Belirli türdeki filmleri filtreleme
        System.out.println("\nFiltrelenen Filmler (Tür: Suç):");
        filmTureGoreFiltrele(filmler, "Suç");
    }

    // Tür parametresine göre filtreleyen metod
    public static void filmTureGoreFiltrele(List<Film> filmler, String tur) {
        for (Film film : filmler) {
            if (film.getTur().equalsIgnoreCase(tur)) {
                System.out.println(film);
            }
        }
    }


 */
