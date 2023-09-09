import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {

    static final String SALES = "data/sales.csv"; //Use backslash Windows users

    public static void main(String[] args) {
        
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());
            Thread thread2 = new Thread(() -> average(path, "Furniture"));
            Thread thread3 = new Thread(() -> average(path, "Technology"));
            Thread thread4 = new Thread(() -> average(path, "Office Supplies"));
            Thread thread5 = new Thread(() -> totalAverage(path));

            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();

        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name to access the Global Superstore dataset: ");
        String name = scan.nextLine();
        System.out.println("Access Denied. We apologize for the inconvenience. Have a good day " + name + ".");
        scan.close();

    }

    public static Double average(Path path, String category) {
        try {
            return Files.lines(path)
                .skip(1)
                .map(l -> l.split(","))
                .filter(val -> val[0].equals(category))
                .mapToDouble(val -> Double.valueOf(val[1]) * Double.valueOf(val[2]))
                    .average().getAsDouble();
            
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return 0.0;
        } 
    }

    public static Double totalAverage(Path path) {
        try {
            return Files.lines(path)
                .skip(1)
                .map(l -> l.split(","))
                .mapToDouble(val -> Double.valueOf(val[1]) * Double.valueOf(val[2]))
                    .average().getAsDouble();
            
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

}
