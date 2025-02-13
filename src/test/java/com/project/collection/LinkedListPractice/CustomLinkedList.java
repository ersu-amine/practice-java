package com.project.collection.LinkedListPractice;

public class CustomLinkedList {
    Node head;

    public void displayContents(){
        Node current = head;

        while(current != null){
            System.out.println(current.data + "->");
            //set current to the next one
            current = current.next;
        }
    }
}
