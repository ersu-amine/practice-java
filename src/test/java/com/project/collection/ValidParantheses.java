package com.project.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ValidParantheses {


    /**
     *
     * @param str , String containing only brackets,
     * @return true if brackets are paired, open and close brackets of same type present
     */
    //DOES NOT handle test4
    public boolean validParantheses(String str){
        String[] strArray = str.split("");

        int halfLength = str.length()/2;

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < strArray.length ; i++) {

            if (i>=halfLength){
                queue.add(strArray[i]);
            }else{
                stack.push(strArray[i]);
            }
        }

        for(int i = 0; i < halfLength; i++){
            //pair brackets by getting the top item from the stack and first item from the queue
            String brackets = stack.peek() + queue.peek();
            //remove brackets from stack
            if (brackets.equals("{}") || brackets.equals("()") || brackets.equals("[]")){
                stack.pop();
                queue.remove();
            }
        }
        //if all brackets paired correctly, stack and queue should be empty
        return stack.isEmpty() && queue.isEmpty();
    }

    public boolean validParantheses2(String str) {
        String[] strArray = str.split("");

        //immutable set
        Set<String> openBrackets = Set.of("{","(","[");
        //mutable set
        Set<String> closeBrackets = new HashSet<>(Arrays.asList("}",")","]"));

        Set<String> bracketPairs = new HashSet<>(Arrays.asList("{}","()","[]"));

        //to contain open brackets
        Stack<String> stack = new Stack<>();
        for (String each : strArray) {
            if (openBrackets.contains(each)) {
                stack.push(each);
            } else if (closeBrackets.contains(each)) {
                String pair = stack.peek() + each;

                if (bracketPairs.contains(pair)) {
                    stack.pop();
                }
            }
        }
            return stack.isEmpty();
    }

    @DisplayName("String str = [(]), expected false")
    @Test
    void test() {
        String s = "[(])";
        System.out.println("[(]) = " + validParantheses(s));
        System.out.println("[(]) = " + validParantheses2(s));

    }

    @DisplayName("String str = ([{}]), expected true")
    @Test
    void test2() {
        String s = "([{}])";
        System.out.println("([{}]) = " + validParantheses(s));
        System.out.println("([{}]) = " + validParantheses2(s));

    }

    @DisplayName("String str = [], expected true")
    @Test
    void test3() {
        String s = "[]";
        System.out.println("[] = " + validParantheses(s));
        System.out.println("[] = " + validParantheses2(s));

    }

    @DisplayName("String str = ()[]{}, expected true")
    @Test
    void test4() {
        String s = "()[]{}";
        System.out.print("()[]{} -> ");
        System.out.println("validParantheses(s) = " + validParantheses(s));
        System.out.print("()[]{} -> ");
        System.out.println("validParantheses2(s) = " + validParantheses2(s));

    }
}
