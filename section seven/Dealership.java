import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        // tohle me ted nezachrani, protoze jde o array objektu, tzn. stale muzu mutovat ten stav tim, ze naprklad setnu color druheho auta na jinou. 
        this.cars = Arrays.copyOf(cars, cars.length);
        // v tomto pripade musim udelat deep copy - vytvorim si nove objektove instance pro jednotliva:
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void sell(int index) {
        this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }


    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    public void setCar(int index, Car newCar) {
        Car copiedCar = new Car(newCar);
        this.cars[index] = copiedCar;
    }

    
}
