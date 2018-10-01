

public class Speeds extends SpeedUnits {
    double value;
    int unit;
    double speed;

    Speeds(double value, int unit) {
        this.value = value;
        this.unit = unit;
        this.speed = speed(unit);

    }

    Speeds(double value, String unit) {
        super();
        this.speed = speed(super.getIndexOfUnit(unit));
    }


    public double speed(int unit) { //return speed in m/h
        switch (unit) {
            case 0:
                return value * 1000;//kmh
            case 1:
                return value * 1609;//mph
            case 2:
                return value * 1852;//kh
            case 3:
                return value * 60;//ms
            default:
                return -1;

        }

    }
}
