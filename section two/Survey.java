import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner waits for user to input the value

        int counter = 0;
        
        System.out.println("\nWelcome. Thank you for taking the survey"); // \n je escape character, tzn pred kazdou otazkou se udela radek volny

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;
        
        scanner.close(); // na konci je vzdy potreba ten scanner closnout, jinak dojde k resource leak

        System.out.println("Thank you" + name + " for answering all "+ counter +" questions");
        System.out.println("Weekly, you spend " + (coffeeAmount * coffeePrice) +" on coffee");
        System.out.println("Weekly, you spend " + (foodAmount * foodPrice) +" on food");

    }
}
