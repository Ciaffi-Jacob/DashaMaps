package com.github.zipcodewilmington.sample;

public class Node{
    String key;
    String value;
    Node next;
    public Node(String key, String value){
        this.key = key;
        this.value = value;
        next = null;
    }
    public String getKey(){
        return key;
    }
    public void setKey(){
        this.key = key;
    }
    public String getValue(){
        return this.value;
    }
    public void setValue(String data){
        this.value = data;
    }
    public Node getNext(){
        return next;
    }
    public  void setNext(Node next){
        this.next = next;
    }
}
