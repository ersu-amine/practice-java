package com.project.array;

public class TriplesInArray {
    /*
    find if array has triples, return true if triple occur in a row

    [1,1,1,2,3] ---> true
    [1,4,1,1,3] ---> false

     */
    public static void main(String[] args) {
        int[] array1 = new int[]{1,1,1,2,3};
        int[] array2 = new int[]{1,4,1,1,3};
        System.out.println("hasTriples(array1) = " + hasTriples(array1));
        System.out.println("hasTriples(array2) = " + hasTriples(array2));

    }

    public static boolean hasTriples(int [] array) {

        //start from second element
        for (int i = 1; i < array.length-1; i++) {
            if(array[i-1]==array[i] && array[i]==array[i+1]){
                //if triple found return true, not needed to iterate further
                return true;
            }
        }
        return  false;

    }
}
