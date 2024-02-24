
import java.util.HashMap;
import java.util.Map;


public class MapTesingOccurence {
    public static void main(String[] args){
        int number = 123451;
        Map<Integer, Integer> out = checkOccurence(number);
        System.out.println(out);
    }
    private static Map<Integer, Integer> checkOccurence(int number) {
        Map<Integer, Integer> map = new HashMap<>();
        while (number > 0) {
            int digit = number % 10;
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1); // if the value already present in map then get the value and add 1

            }
            else {
                map.put(digit, 1); //else normal key value
            }
            number = number / 10;
        }
        return map;
    }
}
