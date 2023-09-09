package model;

import java.util.ArrayList;

public class CarDealership {
    private ArrayList<Car> cars;

    public CarDealership() {
        this.cars = new ArrayList<>();
    }

    public Car getCar(int index) {
        return new Car(this.cars.get(index));
    }

    public void setCar(int index, Car car) {
        this.cars.set(index, new Car(car));
    }

    public void addCar(Car car) {
        this.cars.add(this.cars.size(), new Car(car));
    }

    public void printCars() {
        for (Car car : this.cars) {
            System.out.println(car);
        }
    }

}