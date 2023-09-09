package model;

public class Car {
    public enum BodyType {
        SEDAN,COUPE,HATCHBACK,SUV,TRUCK,VAN
    };
    private String make;
    private BodyType bodyType;
    private int productionYear;

    public Car(String make, BodyType bodyType, int productionYear) {
        setBodyType(bodyType);
        setMake(make);
        setProductionYear(productionYear);
    }

    public Car(Car car) {
        setBodyType(car.bodyType);
        setMake(car.make);
        setProductionYear(car.productionYear);
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if (make.isBlank() || make == null) {
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }
        this.make = make;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear <= 0) {
            throw new IllegalArgumentException("Production year has to be greater than 0.");
        }
        this.productionYear = productionYear;
    }


    public BodyType getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("Bodytype cannot be null.");
        }
        this.bodyType = bodyType;
    }
    

    @Override
    public String toString() {
        return "{" +
            " make='" + getMake() + "'" +
            ", bodyType='" + getBodyType() + "'" +
            ", productionYear='" + getProductionYear() + "'" +
            "}";
    }


}