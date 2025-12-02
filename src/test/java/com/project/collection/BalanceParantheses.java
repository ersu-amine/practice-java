package com.project.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class BalanceParantheses {

    @Test
    void test() {
        String str = "{}{){}";
        String str2= "{}()[]";
        String str3= "}()[]";
        String str4 = "{()[]}";
        String str5 = "{([])}";

        Assertions.assertFalse(validParanthesis(str));
        Assertions.assertTrue(validParanthesis(str2));
        Assertions.assertFalse(validParanthesis(str3));
        Assertions.assertTrue(validParanthesis(str4));
        Assertions.assertTrue(validParanthesis(str5));

    }

    public static boolean validParanthesis(String str){
        Stack<Character> brackets = new Stack<>();

        for(char each : str.toCharArray()){

            //characters can use == sign to compare value
            //add opean brackets to the stack
            if(each=='{' || each == '('  || each=='['){
                brackets.push(each);
            }else{
                if(!brackets.empty()){
                    String couple = "" + brackets.peek() + each;
                    if(couple.equals("{}") || couple.equals("[]") || couple.equals("()")){
                        brackets.pop();
                    }

                }else{
                    //stack is empty and there is no opening bracket present
                    return false;
                }
            }
        }

        //balanced if stack is empty
        return brackets.empty();
    }
}
