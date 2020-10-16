package by.yakovitski.mytasks.lesson7.brackets;

import java.util.Stack;

public class Brackets {
    public static boolean checkBrackets(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }
        else {
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);
                if (character == '(' || character == '{' || character == '[')
                    stack.push(character);
                else if (character == ']') {
                    if (stack.empty() || stack.pop() != '[')
                        return false;
                } else if (character == '}') {
                    if (stack.empty() || stack.pop() != '{')
                        return false;
                } else if (character == ')') {
                    if (stack.empty() || stack.pop() != '(')
                        return false;
                }
            }
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(checkBrackets("()"));
        System.out.println(checkBrackets("([)"));
    }
}
