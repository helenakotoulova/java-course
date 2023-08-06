import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number");
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= number; i++) {
            System.out.print( " " + i + " ");
        }
    }
}
