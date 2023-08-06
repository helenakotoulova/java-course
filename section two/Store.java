public class Store {
    public static void main(String[] args) {
        double profit = 0;
        int numberOfCustomer = 0;
        int numberOfApples = 500;
        double pricePerApple = 0.5;

        numberOfCustomer++;
        numberOfApples -= 20;
        profit += 20 * pricePerApple;

        System.out.println("Store has profit of " + profit + ", number of customer was: " + numberOfCustomer
                + "and number of apples left is: " + numberOfApples);
        

        int people = 4;
        int cheese = 1;
        System.out.println("Each person will have " + (cheese / people) + " portion of cheese"); // Each person will have 0 portion of cheese
        System.out.println("Each person will have " + ((double) cheese / people) + " portion of cheese"); // Each person will have 0.25 portion of cheese

        double salary = 1288.52;
        int roundedSalary = (int) salary;
        System.out.println("salary " + salary + ", rounded salary: " + roundedSalary); // salary 1288.52, rounded salary: 1288


        double sales = 152.52;
        int roundedSales = (int) sales;
    }
}
