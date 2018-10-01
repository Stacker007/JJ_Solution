public class SpeedUnits {
    int indexOfSpeed;
    SpeedUnits(){
        indexOfSpeed = 3;
    }

    SpeedUnits(String speedStr) {
        indexOfSpeed = getIndexOfUnit(speedStr);

    }
    public int getIndexOfUnit(String unit) {
        switch (unit) {
            case "kmh":
                return 0;
            case "mph":
                return 1;
            case "kn":
                return 2;
            case "ma":
                return 3;
            default:
                return -1;

        }
    }
}

