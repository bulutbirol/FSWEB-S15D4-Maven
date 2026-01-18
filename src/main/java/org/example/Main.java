package org.example;

import java.util.Stack;

public class Main {
    public static boolean checkForPalindrome(String input) {
        String cleaned = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (Character.isLetterOrDigit(ch)) {
                cleaned += ch;
            }
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return cleaned.equals(reversed);
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        String binary = "";

        while (!stack.isEmpty()) {
            binary += stack.pop();
        }

        return binary;
    }
}