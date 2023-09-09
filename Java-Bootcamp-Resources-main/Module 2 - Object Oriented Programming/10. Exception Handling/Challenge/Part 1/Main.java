import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) {

        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
    
        while (status.equals("continue")) {
            int choice = promptForChoice(scanner);
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());
    
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            try {
                if (scanner.hasNextInt()) {
                    int choice = scanner.nextInt();
                    incorrectChoice(choice);
                    return choice;
                } else {
                    scanner.nextLine(); // Bez toho to vezme pro to checkovani incorrectChoice ten string "You have to input integer." a dostane se to do nekonecne smycky
                    throw new IllegalArgumentException("\nYou have to input integer.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean incorrectChoice(int choice) {
        if (choice < 0 || choice > 9) {
            throw new IllegalArgumentException("\nYou should choose between 0 and 9.");
        }
        return false;
    }

    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            
            try {
                if (scanner.hasNextDouble()) {
                    double rating = scanner.nextDouble();
                    incorrectRating(rating);
                    return rating;
                } else {
                    scanner.nextLine();
                    throw new IllegalArgumentException("\nYou have to input number.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
         }
    }

    public static boolean incorrectRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating should be between 0 and 10.");
        }
        return false;
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] lineParts = line.split("--");
            if (lineParts.length != 3) {
                scanFile.close();
                throw new RuntimeException("Line does not contain all the relevant info, or it contains some additional info.");
            }
            double rating = Double.parseDouble(lineParts[2]);
            Movie movie = new Movie(lineParts[0], lineParts[1], rating);
            store.addMovie(movie);
        }
        scanFile.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
