import java.util.HashSet;
import java.util.Set;

public class UC3_UniqueBogieIDs {
    public static void main(String[] args) {
        System.out.println("=== UC3: Track Unique Bogie IDs ===");

        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs, including duplicates
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG103");

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
