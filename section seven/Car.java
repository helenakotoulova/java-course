import java.util.Arrays;

public class Car {
    private String make; // brand
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price,  int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        // predtim:
        // this.parts = parts; // ale mela jsem nastorovane spareParts v separatni promenne a vsechny ty objekty ji vyuzivaly jako referenci, tzn. kdyz se zmenila, zmenily se vsechny objekty.
        // potom:
        this.parts = Arrays.copyOf(parts, parts.length); // arrays.copyOf() vytvari novy objekt
    }

    // constructor for copy of car
    public Car(Car car) {
        this.make = car.make;
        this.price = car.price;
        this.year = car.year;
        this.color = car.color;
        this.parts = Arrays.copyOf(car.parts, car.parts.length);
    }

    public String getCarMake() {
        return this.make;
    }

    public void setCarMake(String make) {
        this.make = make;
    }

    public double getCarPrice() {
        return this.price;
    }
    
    public void setCarPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getParts() {
        // je opet potreba vracet separtni instanci. Pokud bych si to totiz vratila a pak s tim operovala (menila polozky), tak to ovlivni i tenhle array.
        return Arrays.copyOf(this.parts,this.parts.length);
    }

    public void setParts(String parts[]) {
        // je to poreba opravit i zde:
        this.parts = Arrays.copyOf(this.parts, this.parts.length);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // methods:
    public void drive() {
        System.out.println("Car of brand " + this.make + " drives to you.");
    }


    // vygenerovane pomoci java code generatoru
    // ma to smysl pro System.out.println(lajda)
    // to totiz predtim vypsalo car a nejaky hash.
    @Override
    public String toString() {
        return "{" +
            " make='" + getCarMake() + "'" +
            ", price='" + getCarPrice() + "'" +
            ", year='" + getYear() + "'" +
            ", color='" + getColor() + "'" +
                // tohle upravime:
                //", parts='" + getParts() + "'" +
            ", parts='" + Arrays.toString(getParts()) + "'" +
            "}";
    }

}
