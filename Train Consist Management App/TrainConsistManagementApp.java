import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();

        System.out.println("Initial bogie count: " + bogies.size());

        // Add passenger bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("Bogies after addition: " + bogies);

        // Remove a bogie
        bogies.remove("AC Chair");

        // Check if Sleeper exists
        System.out.println("Does Sleeper exist? " + bogies.contains("Sleeper"));

        System.out.println("Final bogies: " + bogies);
    }
}
