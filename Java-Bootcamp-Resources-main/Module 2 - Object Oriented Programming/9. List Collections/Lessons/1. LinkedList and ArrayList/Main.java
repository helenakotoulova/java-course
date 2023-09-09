import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        // After creating the ArrayList, the size and capacity are initially 0.
        //cities.ensureCapacity(1); // zajisi min. kapacitu
        cities.add("Brno");
        cities.addAll(1, Arrays.asList("Praha", "Seninka"));
        System.out.println(cities); // [Brno, Praha, Seninka]

        int size = cities.size();
        System.out.println(size); // 3
        System.out.println(cities.get(0)); // Brno
        cities.set(size - 1, "Olomouc");
        System.out.println(cities); // [Brno, Praha, Olomouc]
        cities.remove(2);
        System.out.println(cities); // [Brno, Praha]

        // cities.set(size, "XYZ"); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2

    }

}





