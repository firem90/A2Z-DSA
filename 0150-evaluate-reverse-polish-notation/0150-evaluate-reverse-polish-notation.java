public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (String str : tokens) {
            if (s.isEmpty()) {
                s.push(Integer.valueOf(str));
            } else {
                if (isNumeric(str)) {
                    s.push(Integer.valueOf(str));
                } else {
                    int a = s.pop(); // Second operand
                    int b = s.pop(); // First operand
                    int c = perform(b, a, str);
                    s.push(c);
                }
            }
        }

        return s.peek();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static int perform(int a, int b, String str) {
        if (str.equals("/")) {
            if (b == 0 || a == 0) {
                // Handle division by zero by returning a specific value, for example, Integer.MAX_VALUE
                return 0;
            }
        }

        switch (str) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: return -1;
        }
    }
}
