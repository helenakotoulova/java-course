import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number between 1 and 6");
        int firstNumber = scanner.nextInt();

        System.out.println("Input number between 1 and 6");
        int secondtNumber = scanner.nextInt();

        System.out.println("Input number between 1 and 6");
        int thirdNumber = scanner.nextInt();

        scanner.close();

        if (isLessThanOne(firstNumber, secondtNumber, thirdNumber)
                || isMoreThan6(firstNumber, secondtNumber, thirdNumber)) {
            System.out.println("bad input");
            System.exit(0);
        }

        int sumOfChosenNumbers = firstNumber + secondtNumber + thirdNumber;
        int sumOfRolledNumbers = rollDiceThreeTimes();

        System.out.println(sumOfChosenNumbers);
        System.out.println(sumOfRolledNumbers);

        if (sumOfRolledNumbers < sumOfChosenNumbers && (sumOfChosenNumbers - sumOfRolledNumbers) < 3) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }

    }

    public static boolean isLessThanOne(int number1, int number2, int number3) {
        return (number1 < 1 || number2 < 1 || number3 < 1);
    }

    public static boolean isMoreThan6(int number1, int number2, int number3) {
        return (number1 > 6 || number2 > 6 || number3 > 6);
    }
    
    public static int rollDiceThreeTimes() {
        int diceRoll1 = (int) Math.ceil((Math.random()) * 6); // 0-0.99999 * 6 = 0 - 5.99994 => Math.ceil() => 1 - 6
        System.out.println(diceRoll1);
        int diceRoll2 = (int) Math.ceil((Math.random()) * 6);
        System.out.println(diceRoll2);
        int diceRoll3 = (int) Math.ceil((Math.random()) * 6);
        System.out.println(diceRoll3);
        return diceRoll1 + diceRoll2 + diceRoll3;
    }
}
