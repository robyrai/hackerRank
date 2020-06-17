import java.util.HashMap;
import java.util.Map;

public class RomanToNumeric {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String testNum = "MDCCCXLIV";
        String testNumReverse = new StringBuilder(testNum).reverse().toString();
        char[] chars = testNumReverse.toCharArray();
        int currValue = 1;
        int ans = 0;
        for(char i: chars) {
            int iterValue = map.get(i);
            if(iterValue == currValue) {
                ans += iterValue;
            } else if (iterValue < currValue) {
                ans -= iterValue;
            } else {
                currValue = iterValue;
                ans += iterValue;
            }
        }
        System.out.println("Converting " + testNum + " ... " + ans);
    }
}
