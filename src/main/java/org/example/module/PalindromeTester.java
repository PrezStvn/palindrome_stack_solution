package org.example.module;

import java.util.Stack;

public class PalindromeTester {

    public static boolean isPalindrome(String input) {
        Stack<Character> charStack = new Stack<Character>();
        int j = 0;
        while(j < input.length()/2) {
            charStack.push(input.charAt(j));
            j++;
        }
        if(input.length() % 2 == 1) j++;
        while(j<input.length()) {
            if(input.charAt(j) != charStack.pop()) return false;
            j++;
        }
        return true;
    }
}
