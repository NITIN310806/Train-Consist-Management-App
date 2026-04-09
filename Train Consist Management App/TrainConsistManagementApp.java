import java.util.LinkedHashSet;
import java.util.Set;


public class UC4_OrderedBogieIDs {
    public static void main(String[] args) {
        System.out.println("=== UC5: Preserve Insertion Order of Bogies ===");

        
        Set<String> formation = new LinkedHashSet<>();

        // Attach bogies: Engine, Sleeper, Cargo, Guard
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempt to attach a duplicate bogie (Sleeper again)
        formation.add("Sleeper"); // duplicate, ignored

        System.out.println("Final formation: " + formation);
    }
}
