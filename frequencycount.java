import java.util.HashMap;
import java.util.Map;

class frequencycount {
    public static void main(String[] args) {
        String input = "aabbccccb";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
