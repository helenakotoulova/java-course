public class Movie {
    private String name;
    private String format;
    private double rating;


    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie(Movie movie) {
        this.name = movie.name;
        this.format = movie.format;
        this.rating = movie.rating;
    }
    

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

    public String getName() {
        return this.name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
