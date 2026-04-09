import java.util.LinkedList;


public class UC4_OrderedBogieIDs {
    public static void main(String[] args) {
        System.out.println("=== UC4: Maintain Ordered Bogie IDs ===");

        LinkedList<String> consist = new LinkedList<>();

        // Add bogies: Engine, Sleeper, AC, Cargo, Guard
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial consist: " + consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry Car");

        System.out.println("After inserting Pantry Car: " + consist);

        // Remove the first and last bogie
        consist.removeFirst();
        consist.removeLast();

        System.out.println("Final consist: " + consist);
    }
}
