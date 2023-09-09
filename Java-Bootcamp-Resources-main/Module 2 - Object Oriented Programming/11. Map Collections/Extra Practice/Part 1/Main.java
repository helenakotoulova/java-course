import java.util.Scanner;

import cityModel.City;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CityPopulationTracker tracker = new CityPopulationTracker();

        // Test the addCity method
        tracker.addCity(new City("New York", "USA", 8550405));
        tracker.addCity(new City("Los Angeles", "USA", 3971883));

        // Test the getCity method
        City nyCity = tracker.getCity("New York");
        System.out.println("Population of New York: " + nyCity.getPopulation());

        // Test the setCity method
        City updatedNyCity = new City("New York", "USA", 8600000);
        tracker.setCity(updatedNyCity);

        // Verify that the city data was updated
        nyCity = tracker.getCity("New York");
        System.out.println("Updated population of New York: " + nyCity.getPopulation());

        tracker.printCityPopulations();

        String cityName = promptForCityName(scanner);


        String country = promptForCountry(scanner);


        int population = promptForPopulation(scanner);


        City newCity = new City(cityName, country, population);

        tracker.addCity(newCity);


        System.out.println("City added to the tracker: " + newCity.getName());

        tracker.printCityPopulations();

    }
    
    public static boolean isNullOrBlank(String input) {
        return input.isBlank() || input == null;
    }

    public static boolean incorrectPopulation(int population) {
        return population <= 0;
    }

    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            if (isNullOrBlank(cityName)) {
                System.out.println("Incorrect input.");
            } else {
                return cityName;
            }
        }
    }

     public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid country: ");
            String cityName = scanner.nextLine();
            if (isNullOrBlank(cityName)) {
                System.out.println("Incorrect input.");
            } else {
                return cityName;
            }
        }
    }
    
    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("The input has to be integer.");
                continue;
            }
            int population = scanner.nextInt();
            if (incorrectPopulation(population)) {
                System.out.println("Population has to be > 0.");
            } else {
                return population;
            }
        }
    }
    

    
    
}