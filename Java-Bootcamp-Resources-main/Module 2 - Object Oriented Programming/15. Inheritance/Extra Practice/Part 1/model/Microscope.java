package model;

public class Microscope extends LabEquipment {
    private final int MINIMUM_MAGNIFICATION = 1;
    private int magnification;

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }
    
    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int magnification) {
        if (!isGreaterOrEqualToMinimumMagnification(magnification)) {
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    public boolean isGreaterOrEqualToMinimumMagnification(int magnification) {
        return magnification >= MINIMUM_MAGNIFICATION;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance done.";
    }

    

}
