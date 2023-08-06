import java.util.Scanner;

public class Main {

    static Store store = new Store();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8),
        };

        System.out.println("******************************MOVIE STORE*****************************");

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Index " + i + ", movie: " + movies[i]);
            store.setMovie(i, movies[i]);
        }

        store.printStore();

        System.out.print("\nPlease choose an integer between 0 - 9: ");

        int index = scanner.nextInt();
        Movie movie = store.getMovie(index);

        System.out.print("Set a new rating for " + movie.getName() + ": ");

        double rating = scanner.nextDouble();
        Movie newMovie = new Movie(movie);
        newMovie.setRating(rating);

        store.setMovie(index, newMovie);
        
        System.out.println("Movies in the store:");
        store.printStore();

        scanner.close();
    }
}
