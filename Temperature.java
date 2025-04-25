import java.util.ArrayList;
public class Temperature {

    public static void analyzeTemperatures(ArrayList<Double> temperatures) {
        int feverCount = 0;
        double maxTemperature = Double.MIN_VALUE;
        for (Double temp : temperatures) {
            
            if (temp >= 37.5) {
                feverCount++;
            }
            
            if (temp > maxTemperature) {
                maxTemperature = temp;
            }
        }
        System.out.println("Number of fever: " + feverCount);
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