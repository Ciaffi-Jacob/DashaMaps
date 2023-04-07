package com.github.zipcodewilmington.sample;

public class Node{
    String data;
    Node next;
    public Node(String data){
        this.data = data;
        next = null;
    }
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    public Node getNext(){
        return next;
    }
    public  void setNext(Node next){
        this.next = next;
    }
}
