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
        ArrayList<Speeds> speedsArrayList = new ArrayList<>();
        line = reader.readLine();
        int iSpace = line.indexOf(' ');
        double value = Double.parseDouble(line.substring(0, iSpace));
        String unit = line.substring(iSpace + 1, line.length());

        //Раздел 2, Пункт 1:

        Times ourTime = new Times(value, unit);



        while ((line = reader.readLine()) != null) {
            iSpace = line.indexOf(' ');
            value = Double.parseDouble(line.substring(0, iSpace));
            unit = line.substring(iSpace + 1, line.length());
            speedsArrayList.add(new Speeds(value, unit));
        }
        //Пункт 2:
        for (Speeds tmp : speedsArrayList
                ) {
            System.out.println(tmp.getValue() + " " + tmp.getNameOfUnit() + " = " + tmp.getSpeed() + " ms");

        }
        //Пункт 3:

        double distances[] = new double[speedsArrayList.size()];
        distances[0] = speedsArrayList.get(0).getSpeed()*ourTime.getTime();
        for (int i = 1; i<speedsArrayList.size();i++){
            double distance = speedsArrayList.get(i).getSpeed()*ourTime.getTime();
            
            for (int j=1; j<=i; j++){
                if(distance>distances[j-1]){
                    for (int k = i;k>=j;k--){
                        distances[k]=distances[k-1];
                    }
                    distances[j-1]=distance;
                }
            }
        }
        for (double dist:distances
             ) {
            System.out.println(dist);

        }



    }

}
