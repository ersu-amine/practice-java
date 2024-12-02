package com.project.string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidateEmailAddress {
    /*
    Requirements:
        Create a method isValidEmail(String email) that takes an email address as input and returns true if the email is valid, or false otherwise.

        An email is considered valid if:
        It contains exactly one "@" symbol.
        The domain part (after "@") contains at least one dot (".") and dots are not consecutive.
        The local part (before "@") is non-empty.
        The domain part does not start or end with a dot.
     */

    @Test
    void emailValidityTest() {
        String[] emails = {
                "example@gmail.com",
                "test.email@domain.com",
                "invalid@domain..com",
                "missingatsign.com",
                "@nouser.com",
                "user@.com"
        };

        for (String each : emails) {
            if(isValidEmail(each)){
                System.out.println("Email = " + each +" is valid");
            }else{
                System.out.println("Email = " + each +" is invalid");
            }
        }
    }

    public boolean isValidEmail(String email){
        boolean isValid = true;
        //make string arrayList
        List<String> list = new ArrayList<>(Arrays.asList(email.split("")));

        //check if email has @ sign
        if(email.contains("@")){
            // check and return false if there's more than 1 @ sign
            if(Collections.frequency(list, "@") !=1 ){
                isValid = false;
             //email has only 1 @
            }else {
                //store the index of @
                int index = email.indexOf('@');

                //separate email into two parts using index of @
                String localPart = email.substring(0, index);
                String domainPart = email.substring(index+1);

                //check domain part contains at least 1 dot
                //      local part is not empty
                //      domain part does not start or end with dot
                if(!domainPart.contains(".") || localPart.isEmpty() || domainPart.startsWith(".") || domainPart.endsWith(".")){
                    isValid = false;

                }else if(Collections.frequency(Arrays.asList(domainPart.split("")),".") > 1){
                    int indexOfFirstDot = domainPart.indexOf('.');
                    //check if there's consecutive dot present in the domain part
                    if (domainPart.charAt(indexOfFirstDot+1) == '.'){
                        isValid = false;
                    }
                }
            }
        }else {
            isValid = false;
        }
        return isValid;
    }
}
