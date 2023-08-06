import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dice = 0;
        while (dice < 6) {
            dice = rollDice();
            System.out.println(dice);
        }

        int computerNumber = (int) Math.ceil(Math.random() * 5);

        System.out.println("Try to guess the number. It is between 1 and 5");

        int guess = 0;

        while (guess != computerNumber) {
            System.out.println("Guess number:");
            guess = scanner.nextInt();
        }

        scanner.close();
        System.out.println("You guessed it!" + " " + computerNumber);

    }
    
    public static int rollDice() {
        return (int) Math.ceil(Math.random() * 6);
    }
}
