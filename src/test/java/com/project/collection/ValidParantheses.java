package com.project.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ValidParantheses {

    /**
     *
     * @param str , String containing only brackets,
     * @return true if brackets are paired, open and close brackets of same type present
     */
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

        System.out.println("stack = " + stack);
        System.out.println("queue = " + queue);


        for(int i = 0; i < halfLength; i++){
            //pair brackets by getting the top item from the stack and first item from the queue
            String brackets = stack.peek() + queue.peek();
            System.out.println("brackets = " + brackets);
            //remove brackets from stack
            if (brackets.equals("{}") || brackets.equals("()") || brackets.equals("[]")){
                stack.pop();
                queue.remove();
            }
        }
        //if all brackets paired correctly, stack and queue should be empty
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
        System.out.println("queue.isEmpty() = " + queue.isEmpty());

        return stack.isEmpty() && queue.isEmpty();
    }
    @DisplayName("String str = [(]), expected false")
    @Test
    void test() {
        String s = "[(])";
        System.out.println("[(]) = " + validParantheses(s));

    }

    @DisplayName("String str = ([{}]), expected true")
    @Test
    void test2() {
        String s = "([{}])";
        System.out.println("([{}]) = " + validParantheses(s));

    }

    @DisplayName("String str = [], expected true")
    @Test
    void test3() {
        String s = "[]";
        System.out.println("[] = " + validParantheses(s));

    }

    @DisplayName("String str = ()[]{}, expected true")
    @Test
    void test4() {
        String s = "()[]{}";
        System.out.println("()[]{} = " + validParantheses(s));

    }
}
