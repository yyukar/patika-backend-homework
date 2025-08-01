package week3.movieCollectionFilter;

import java.util.*;

public class Movie {
    // Film özellikleri
    private String name;
    private int year;
    private String genre;
    private double imdbRating;

    //Constructor
    public Movie(String name, int year, String genre, double imdbRating) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.imdbRating = imdbRating;
    }

    // Getter metodları
    public String getGenre() {
        return genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public int getYear() {
        return year;
    }

    // Film bilgilerini string olarak döndür
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
