public class ReverseString {
    public static void main(String[] args) {
        String name = "Bon Iver";

        char[] nameChars = name.toCharArray();
        char[] reversedChars = new char[name.length()];
        int loopIndex = name.length() - 1;

        for (char i : nameChars) {
            reversedChars[loopIndex] = i;
            loopIndex--;
        }

        String reversed = new String(reversedChars);
        System.out.println("Reversed using a loop = " + reversed);

        // Using StringBuilder's reverse()
        StringBuilder sb = new StringBuilder(name);
        System.out.println("Reversed by stringBuilder = " + sb.reverse().toString());
    }
}
