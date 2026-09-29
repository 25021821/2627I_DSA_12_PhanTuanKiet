package BalancedBrackets;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']'
                    || current == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();

                if (!isMatchingPair(openBracket, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String expression = scanner.nextLine();

        if (isBalanced(expression)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        scanner.close();
    }
}