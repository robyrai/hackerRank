public class BinarCalcRepeatingOnes {
    public static void main(String[] args) {
        String s = Integer.toBinaryString(13);
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                int tempCount = 1;
                int j = i + 1;
                while (j < chars.length && chars[j] == '1') {
                    tempCount++;
                    j++;
                    i++;
                }
                while (j < chars.length && chars[j] == '0') {
                    j++;
                    i++;
                }
                if (count < tempCount) {
                    count = tempCount;
                }
            }
        }
        System.out.println(count);
    }
}
