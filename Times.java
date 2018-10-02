public class Times extends TimeUnits {
    private double value;
    private int unit;
    private double time;//time in s

    Times(double value, int unit) {
        this.value = value;
        this.unit = unit;
        this.time = time(value,unit);

    }

    Times(double value, String unit) {
        this.value = value;
        this.unit = getIndexOfUnit(unit);
        this.time = time(value,this.unit);
    }

    public double getValue() {
        return value;
    }

    public int getUnit() {
        return unit;
    }

    public double getTime() {
        return time;
    }
}
