public class FindLongestPalindrome {
    static int startingPoint = 0;
    static int wordLength = 0;

    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = "snoondog";
        String test3 = "madamsracecarscreams";

        System.out.println(getPalindrome(test1));
        System.out.println(getPalindrome(test2));
        System.out.println(getPalindrome(test3));

    }

    static String getPalindrome(String word) {
        String result = longestPalindrome(word);
        startingPoint = 0;
        wordLength = 0;
        return result;
    }

    static String longestPalindrome(String word) {
        for(int i = 0; i < word.length() - 1; i++) {
            checkPalindrome(word, i, i);
            checkPalindrome(word, i, i + 1);
        }
        return word.substring(startingPoint, startingPoint + wordLength);
    }

    private static void checkPalindrome(String word, int begin, int end) {
        while(begin >= 0 && end < word.length() && word.charAt(begin) == word.charAt(end)) {
            begin--;
            end++;
        }

        // We did a begin-- and end++ before breaking out of while loop earlier offsetting the
        // begin and end by two altogether. To find the inclusive length you have to add one to
        // the difference of two points. So the word length in this case is given by:
        // length = (end - 1) - (begin - 1) + 1
        if (end - begin - 1 > wordLength) {
            startingPoint = begin + 1;
            wordLength = end - begin - 1;
        }
    }
}
