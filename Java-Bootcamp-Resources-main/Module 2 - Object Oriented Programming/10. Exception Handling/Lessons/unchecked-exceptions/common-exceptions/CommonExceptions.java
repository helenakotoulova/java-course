import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {

        //**************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] {96, 65, 56, 86};
        System.out.println(grades[3]); // puvodne: System.out.println(grades[4]);

       //**************NullPointerException**************//
        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        for (String name : names) {
            if (name != null) { // puvodne bez toho ifu
                System.out.println(name.toUpperCase());
            }
        }

        //**************InputMismatchException**************//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        //scanner.nextInt(); // puvodne to bylo jen takhle

        if (scanner.hasNextInt()) {
            scanner.nextInt();
        } else {
            scanner.next();
        }

        scanner.close();

    }
}