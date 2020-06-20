public class CountingValleys {
    public static void main(String[] args) {
        String s = "UDDDUDUU";
        int i = 8;
        System.out.println(countingValleys(i, s));
    }
    
    // Not the best time complexity. Will try to do a better one next time
    static int countingValleys(int n, String s) {
        int[] altitude = new int[n + 1];
        char[] steps = s.toCharArray();
        int[] increases = new int[n];
        for (int i = 0; i < n; i++) {
            if (steps[i] == 'U') {
                increases[i] = 1;
            } else {
                increases[i] = -1;
            }
        }

        int temp = 0;
        for (int i = 1; i < n; i++) {
            altitude[i] += temp + increases[i - 1];
            temp = altitude[i];
        }

        int valleyCount = 0;
        for (int i = 0; i <= n; i++) {
            while (i != n && altitude[i] == 0 && altitude[i + 1] < 0) {
                valleyCount += 1;
                i++;
                while (altitude[i] != 0) {
                    i++;
                }
            }
        }
        return valleyCount;
    }
}
