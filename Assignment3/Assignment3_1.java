//1. In singly linear linked list implement following operations.
//i. insert a new node after a given data
//ii. insert a new node before a given data

import java.util.Stack;

public class Assignment3_1 {
	
	public static int calculate(int op1, char opr, int op2) {
        switch (opr) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '*': return op1 * op2;
            case '/': return op1 / op2;
            case '%': return op1 % op2;
            case '$': return (int) Math.pow(op1, op2);
        }
        return 0;
    }


    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") ||
               token.equals("/") || token.equals("%") || token.equals("$");
    }



    public static int postfixEvaluation(String postfix) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = postfix.trim().split("\\s+");

        // Traverse from left to right
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (isOperator(token)) {
                // Pop op2 first, then op1
                int op2 = st.pop();
                int op1 = st.pop();
                int res = calculate(op1, token.charAt(0), op2);
                st.push(res);
            } else {

            	st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }


    public static int prefixEvaluation(String prefix) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = prefix.trim().split("\\s+");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (isOperator(token)) {
                int op1 = st.pop();
                int op2 = st.pop();
                int res = calculate(op1, token.charAt(0), op2);
                st.push(res);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    
    public static void main(String[] args) {
        String postfix = "10 20 + 3 *";
        int postResult = postfixEvaluation(postfix);
        System.out.println("Postfix: " + postfix + " = " + postResult);



        String prefix = "- + 100 200 50";
        int preResult = prefixEvaluation(prefix);
        System.out.println("Prefix:  " + prefix + " = " + preResult);
    }
}
