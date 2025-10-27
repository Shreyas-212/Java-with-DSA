import java.util.Stack;

public class duplicateParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count == 0) {
                    return true;
                }

                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";  
        String str2 = "(a-b)";   
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
    }
}