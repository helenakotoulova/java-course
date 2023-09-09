package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {
    private List<Movie> movies;

    public MovieStore() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        this.movies.add(this.movies.size(), new Movie(movie));
    }

    public List<Movie> filterByGenre(String genre) {
        return this.movies.stream().filter(m -> m.getGenre().equals(genre)).toList();
    }

    public List<Movie> sortByYear() {
        return this.movies.stream().sorted((l, r) -> Integer.compare(l.getYear(), r.getYear())).toList();
    }

    public List<Movie> getTopRatedMovies(int numberOfMovies) {
        return this.movies.stream().sorted((l, r) -> Double.compare(r.getRating(), l.getRating())).limit(numberOfMovies).toList();
    }
}

