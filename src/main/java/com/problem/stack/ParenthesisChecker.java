package com.problem.stack;

import java.util.Stack;

/**
 * Check if the parenthesis are balanced in a string
 * <a href="https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/">Article</a>
 * 
 * @author arawat
 */
public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "{[{[()}]}";
        ParenthesisChecker pc = new ParenthesisChecker();
        System.out.println(pc.isBalanced(str) ? "balanced" : "not balanced");
    }

    private boolean isBalanced(String str) {

        if (str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            switch (curr) {
                case '{':
                case '[':
                case '(':
                    stack.push(curr);
                    break;

                case '}':
                case ']':
                case ')':

                    if (!stack.isEmpty() && isEquivalentPair(stack.peek(), curr)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

    public boolean isEquivalentPair(char a, char b) {
        if (a == '{' && b == '}') {
            return true;
        }

        if (a == '[' && b == ']') {
            return true;
        }

        if (a == '(' && b == ')') {
            return true;
        }

        return false;
    }
}
