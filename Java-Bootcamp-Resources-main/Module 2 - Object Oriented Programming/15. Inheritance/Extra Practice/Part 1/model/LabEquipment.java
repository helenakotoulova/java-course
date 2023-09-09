package model;

public abstract class LabEquipment {
    private final int MINIMAL_YEAR = 1950;

    private String manufacturer;
    private String model;
    private int year;

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (isNullOrBlank(manufacturer)) {
            throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        }
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (isNullOrBlank(model)) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (!isGreaterOrEqualToMinimumYear(year)) {
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }
        this.year = year;
    }

    private boolean isNullOrBlank(String str) {
        return str.isBlank() || str == null;
    }

    private boolean isGreaterOrEqualToMinimumYear(int year) {
        return year >= MINIMAL_YEAR;
    }

    public abstract String performMaintenance();

}