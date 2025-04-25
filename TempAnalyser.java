import java.util.ArrayList;
import java.util.Collections;

public class TempAnalyser {

    public static void analyzeTemperatures(ArrayList<Double> temperatures) {
      
        long feverCount = temperatures.stream()
                                      .filter(temp -> temp >= 37.5)
                                      .count();
        Collections.sort(temperatures);

        double maxTemperature = temperatures.get(temperatures.size() - 1);


        System.out.println("Number of fevers: " + feverCount);
        System.out.println("Maximum temperature: " + maxTemperature);
    }

    public static void main(String[] args) {
        
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(36.1);
        temperatures.add(38.9);
        temperatures.add(39.2);
        temperatures.add(35.0);
        temperatures.add(36.5);

        analyzeTemperatures(temperatures);
    }
}
//i had help with this one