import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancingBrackets {
    public static void main(String[] args) {
        String s1 = "}][}}(}][))]";
        String s2 = "[](){()}";
        String s3 = "({}([][]))[]()";
        System.out.println(isBalanced(s1));
        System.out.println(isBalanced(s2));
        System.out.println(isBalanced(s3));
    }

    static String isBalanced(String s) {
        if (s.equals("")) return "YES";
        char[] brackets = s.toCharArray();
        Stack<Character> stk = new Stack<>();

        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('[', ']');
        bracketsMap.put('{', '}');

        boolean checkCompleted = false;
        for (char c : brackets) {
            if (c == '{' || c == '[' || c == '(') {
                stk.push(c);
                checkCompleted = true;
            } else if (!stk.isEmpty() && c == bracketsMap.get(stk.peek())) {
                stk.pop();
                checkCompleted = true;
            } else if (c == '}' || c == ']' || c == ')' && stk.isEmpty()) {
                checkCompleted = false;
                break;
            } else {
                checkCompleted = false;
                break;
            }
        }
        return stk.size() == 0 && checkCompleted ? "YES" : "NO";
    }
}
