import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
                .filter(el -> el > 100)
                .map(el -> el - 20)
                .sorted((r, l) -> r.compareTo(l))
                .map(el -> el + "dollars")
                .forEach(el -> System.out.println(el));
    }
}