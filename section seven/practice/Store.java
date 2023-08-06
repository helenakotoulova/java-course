public class Store {
    private Movie[] movies;

    public Store() {
        this.movies = new Movie[8];
    }

    public Store(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            this.movies[i] = new Movie(movies[i]);
        }
    }
    
    public Movie getMovie(int index) {
        return new Movie(this.movies[index]);
    }
    
    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }

    public void printStore() {
        System.out.println("Number of movies" + this.movies.length);
        for (int i = 0; i < this.movies.length; i++) {
            System.out.println(this.movies[i]);
        }
    }
}
