public class Times extends TimeUnits {
    double value;
    int unit;
    double time;//time in s

    Times(double value, int unit) {
        this.value = value;
        this.unit = unit;
        this.time = time(unit);

    }

    Times(double value, String unit) {
        super();
        this.time = time(super.getIndexOfUnit(unit));
    }


    public double time(int unit) { //return speed in m/h
        switch (unit) {
            case 0:
                return value * 3600;//h
            case 1:
                return value * 60;//m
            case 2:
                return value;//s
            default:
                return -1;

        }

    }
}
