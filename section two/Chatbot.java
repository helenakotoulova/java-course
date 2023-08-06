import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Whats your name?");

        String name = scanner.nextLine();
        System.out.println("Hello "+name+"! Where are you from?");

        String city = scanner.nextLine();
        System.out.println("it is nice in" + city + "How old are you?");

        int age = scanner.nextInt();
        double chatBotAge = 400;
        System.out.println(
                age + "! Thats cool. I am 400 years old. That means, I am " + (chatBotAge / age)
                        + "older than you. Do you like dogs?");

        scanner.nextLine();
        String likeDogs = scanner.nextLine();
        System.out.println("I see, that you " + likeDogs);

        scanner.close();
    }
}
