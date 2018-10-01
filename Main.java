import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        File myFile = new File(args[0]);
        FileReader fr = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(fr);
        String line;
        ArrayList<Speeds>  speedsArrayList= new ArrayList<>();
        line = reader.readLine();
        int iSpace = line.indexOf(' ');
        double value = Double.parseDouble(line.substring(0, iSpace - 1));
        String unit = line.substring(iSpace + 1, line.length() - 1);

        Times ourTime = new Times(value, unit);

        while ((line = reader.readLine()) != null) {
            iSpace = line.indexOf(' ');
            value = Double.parseDouble(line.substring(0, iSpace - 1));
            unit = line.substring(iSpace + 1, line.length() - 1);
            speedsArrayList.add(new Speeds(value, unit));
        }


    }

}
