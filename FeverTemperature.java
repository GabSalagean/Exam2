import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class FeverTemperature {
    
    public static void main(String[] args) {
       
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(36.1);
        temperatures.add(38.9);
        temperatures.add(39.2);
        temperatures.add(35.0);
        temperatures.add(36.5);

        analyzeTemperatures(temperatures);
    }

    public static void analyzeTemperatures(ArrayList<Double> temperatures) {
       
        long feverCount = temperatures.stream()
                                      .filter(temp -> temp >= 37.5)
                                      .count();
        
        double maxTemperature = Collections.max(temperatures);
        
        System.out.println("Number of fevers: " + feverCount);
        System.out.println("Maximum temperature: " + maxTemperature);
    }

    //i had help with this one
}
