

public class Speeds extends SpeedUnits {
    private double value;
    private int unit;
    private double speed;

    Speeds(double value, int unit) {
        this.value = value;
        this.unit = unit;
        this.speed = speedMS(value, unit);
    }

    Speeds(double value, String unit) {
        this.value = value;
        this.unit = getIndexOfUnit(unit);
        this.speed = speedMS(value, this.unit);
    }

    public String getNameOfUnit() {
        return super.getNameOfUnit(this.unit);
    }

    public double getValue() {
        return value;
    }

    public int getUnit() {
        return unit;
    }

    public double getSpeed() {
        return speed;
    }
}
