import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        String username = scanner.nextLine();
        while (username.isBlank() || username == null) {
            System.out.println("Incorrect username.");
            System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
            username = scanner.nextLine();
        }
        // try {
        //     user.setUsername(scanner.nextLine());
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }
       
        
        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        try {
            if (scanner.hasNextInt()) {
                user.setAge(scanner.nextInt());
            } else { 
                throw new InputMismatchException("You need to input a number.");
            }
        } catch (RuntimeException e) { // general exception - InputMismatchException and IllegalArgumentException are both RuntimeException
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
        
    }     
}