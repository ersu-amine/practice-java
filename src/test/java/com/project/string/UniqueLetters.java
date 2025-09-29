package com.project.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueLetters {

    public String removeNonUniqueLetter(String str){
        String result = "";

        for (String each : str.split("")){
            if(result.contains(each)){
                result = result.replaceAll(each,"");

            }else {
                result += each;
            }
        }

        return result;
    }

    @Test
    void test() {
        String str = "cup of java";
        String str2 = "apple";

        Assertions.assertEquals("cupofjv", removeNonUniqueLetter(str));
        Assertions.assertEquals("ale", removeNonUniqueLetter(str2));
    }
}
