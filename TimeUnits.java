abstract public class TimeUnits {
    public int getIndexOfUnit(String unit) {
        switch (unit) {
            case "h":
                return 0;
            case "m":
                return 1;
            case "s":
                return 2;
            default:
                return -1;
        }
    }
    public double time(double value, int unit) { //return time in "s"
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
