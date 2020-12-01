import java.util.HashMap;
import java.util.Map;

public class CharacterOccuranceInString {
    public static void solution(String str) {
        // Creating a HashMap containing char 
        // as a key and occurrences as a value 
        Map<Character, Integer> map = new HashMap<>();
        
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (map.containsKey(c)){
                 // If character is present 
                // in map incrementing it's 
                // count by 1 
                map.put(c, map.get(c) + 1);
            }
            else {
                // If character is not present 
                // in map putting this 
                // character into map with 
                // 1 as it's value. 
                map.put(c, 1);
            }
        }
        // Traverse the HashMap, check 
        // if the count of the character 
        // is greater than 1 then print 
        // the character and its frequency 
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "coca cola";
        solution(str);
    }
}
