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

        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}
