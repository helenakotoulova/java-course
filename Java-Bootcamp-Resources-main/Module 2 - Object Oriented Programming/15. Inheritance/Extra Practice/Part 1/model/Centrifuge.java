package model;

public class Centrifuge extends LabEquipment {
    private final int MIN_RPM = 500;
    private int maxRPM;

    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        setMaxRPM(maxRPM);
    }
    
    public int getMaxRPM() {
        return this.maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if (!isGreaterOrEqualToMinimumMaximumRPM(maxRPM)) {
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum maxRPM.");
        }
        this.maxRPM = maxRPM;
    }

    public boolean isGreaterOrEqualToMinimumMaximumRPM(int maxRPM) {
        return maxRPM >= MIN_RPM;
    }

    @Override
    public String performMaintenance() {
        return "Centirfuge maintenance done.";
    }

}
