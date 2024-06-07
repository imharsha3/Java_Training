package com.java.pratice.collection_examples.linkedList_examples;

import java.util.LinkedList;

public class StackUsingLinkedList {
    private LinkedList<Integer> list = new LinkedList<>();

    public void push(Integer i){
        list.addFirst(i);
    }

    public Integer pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst();
    }

    public Integer peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(15);
        stackUsingLinkedList.push(20);

        System.out.println("Stack size:"+stackUsingLinkedList.size());
        System.out.println("Top element:"+stackUsingLinkedList.peek());

        System.out.println("Popped element:"+stackUsingLinkedList.pop());
        System.out.println("Stack size after pop:"+stackUsingLinkedList.size());
    }

}
