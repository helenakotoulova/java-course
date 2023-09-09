package model;

public class Movie {
    private String name;
    private String director;
    private String genre;
    private int year;
    private double rating;

    public Movie(Movie movie) {
         this.name = movie.name;
        this.director = movie.director;
        this.genre =movie.genre;
        this.year = movie.year;
        this.rating = movie.rating;
    }

    public Movie(String name, String director, String genre, int year, double rating) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", director='" + getDirector() + "'" +
            ", genre='" + getGenre() + "'" +
            ", year='" + getYear() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }
    
}
