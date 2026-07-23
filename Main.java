import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        // Add elements
        marks.put("Deepa", 90);
        marks.put("Anu", 85);
        marks.put("Rahul", 78);

        // Print HashMap
        System.out.println(marks);

        // Get value
        System.out.println("Deepa Marks: " + marks.get("Deepa"));

        // Check key
        System.out.println(marks.containsKey("Anu"));

        // Remove element
        marks.remove("Rahul");

        System.out.println(marks);
    }
}