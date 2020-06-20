import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, ar));
    }

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i: ar) {
            if(m.keySet().contains(i)) {
                m.put(i, m.get(i) + 1);
            } else {
                m.put(i, 1);
            }
        }
        int count = 0;
        for(Integer i: m.keySet()) {
            count += m.get(i)/2;
        }
        return count;
    }
}
