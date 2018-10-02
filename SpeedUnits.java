abstract public class SpeedUnits {
    public int getIndexOfUnit(String unit) {
        switch (unit) {
            case "kmh":
                return 0;//kmh
            case "mph":
                return 1;//mph
            case "kn":
                return 2;//kh
            case "ms":
                return 3;//ms
            default:
                return -1;

        }
    }
    public String getNameOfUnit (int unit) {
        switch (unit) {
            case 0:
                return "kmh";//kmh
            case 1:
                return "mph";//mph
            case 2:
                return "kn";//kh
            case 3:
                return "ms";//ms
            default:
                return "ms";

        }
    }

    public double speedMH(double value, int unit) { //return speed in m/h
        switch (unit) {
            case 0:
                return value * 1000;//kmh
            case 1:
                return value * 1609;//mph
            case 2:
                return value * 1852;//kh
            case 3:
                return value * 3600;//ms
            default:
                return -1;

        }

    }
    public double speedMS(double value, int unit){
        return speedMH(value,unit)/3600;
    }

}

