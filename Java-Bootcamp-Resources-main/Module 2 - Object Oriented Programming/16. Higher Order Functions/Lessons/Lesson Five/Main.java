import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // *******************forEach*******************
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
        
        usernames.stream().map(el -> el.toUpperCase())
                .forEach(el -> System.out.println(el));

        List<String> upperUsernames = usernames.stream().map(el -> el.toUpperCase()).toList();


        // *******************reduce*******************

        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
        Double totalEarnings = earnings.stream().reduce(0.00, (x,y) -> x+y); // musela jsem to zmenit na 0.00 z 0, aby to nervalo
        System.out.println(totalEarnings);

        // *******************reduce*******************

        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
        Double fundsRemaining = expenses.stream().reduce(totalEarnings, (x, y) -> x - y);
        
        System.out.println("\nYou still have $ " + fundsRemaining);
       
       
        // *******************findFirst*******************
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");
        String result = aisles.stream().filter(el -> el.equals("coffee")).findFirst().orElse(null);
        String response = result == null ? "No, we dont" : "Yes, we have";
        System.out.println(response);

        List<Integer> list = Arrays.asList(1, 10, 3, 7, 5);
        int a = list.stream()
            .peek(num -> System.out.println("will filter " + num))
            .filter(x -> x > 5)
            .findFirst()
            .get();
        System.out.println(a);
        
        
        // *******************count*******************        
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 1 repeat?");
        long count = numbers.stream().filter(el -> el == 1).count();

        System.out.println("The number 1 repeats "+ count +" times");
        
    }   
    
}

