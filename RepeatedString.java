public class RepeatedString {
    public static void main(String[] args) {
        String s = "aba";
        long n = 10;
        System.out.println(repeatedString(s, n));
    }

    static long repeatedString(String s, long n) {
        long countInStr = 0;
        char[] letters = s.toCharArray();
        for(char c: letters) {
            if(c == 'a') countInStr++;
        }
        long numOfWholeStrRepeat = n / letters.length;
        int partialRepeat = (int)(n % letters.length);
        int countOfPartialRepeat = 0;
        for(int i = 0; i < partialRepeat; i++) {
            if(letters[i] == 'a') countOfPartialRepeat++;
        }

        return (numOfWholeStrRepeat * countInStr) + countOfPartialRepeat;
    }
}
