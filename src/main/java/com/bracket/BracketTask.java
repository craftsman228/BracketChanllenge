package com.bracket;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BracketTask {

    public boolean checker(String input) {

        Stack<Character> checkingStack = new Stack<>();

        List<Character> openBrackets = Arrays.asList('(', '{', '[');
        List<Character> closeBrackets = Arrays.asList(')', '}', ']');

        for (int i = 0; i < input.length(); i++) {
            Character symbol = input.charAt(i);
            if (openBrackets.contains(symbol)) {
                checkingStack.push(symbol);
            }
            if (closeBrackets.contains(symbol)) {
                if (checkingStack.isEmpty()) {
                    return false;
                }
                Character openBracket = checkingStack.pop();
                int bracketIndex = openBrackets.indexOf(openBracket);

                Character closeBracket = closeBrackets.get(bracketIndex);
                if (!symbol.equals(closeBracket)) {
                    return false;
                }
            }
        }
        return checkingStack.isEmpty();
    }
}
