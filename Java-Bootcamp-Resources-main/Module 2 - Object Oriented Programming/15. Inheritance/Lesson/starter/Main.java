import product.Pants;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(10.99, "red", "H&M", Size.SMALL);
        Pants pants = new Pants(20, "blue", "Levis", 50, 50);

        System.out.println(shirt.getColor());
        System.out.println(pants.getColor());

        shirt.fold();
        pants.fold();

    }

}
