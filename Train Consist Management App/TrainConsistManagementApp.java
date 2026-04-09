import java.util.HashMap;
import java.util.Map;

public class UC6_BogieCapacityMapping {
    public static void main(String[] args) {
        System.out.println("=== UC6: Map Bogie to Capacity ===");

        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert capacity values for bogies
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Iterate over the map using entrySet() and display
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + ", Capacity: " + entry.getValue());
        }
    }
}
