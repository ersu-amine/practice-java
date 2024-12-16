package com.project;

public class InstanceStaticVariables {
    public static int x =5;
    int y =9;

    public static void main(String[] args) {
        System.out.println(x);
        InstanceStaticVariables test1 = new InstanceStaticVariables();
        System.out.println(test1.y);
    }

}
