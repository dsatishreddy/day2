package day2_3;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        String text = "INDIA IS MY COUNTRY";

        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : text.toCharArray()) {

            // skip spaces (optional)
            if (ch == ' ') {
                continue;
            }

            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }

        // print result
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
