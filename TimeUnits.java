public class TimeUnits {
    int indexOfTime;
    TimeUnits(){
        indexOfTime = 2;
    }

    TimeUnits(String time) {
        indexOfTime = getIndexOfUnit(time);
    }

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
}
