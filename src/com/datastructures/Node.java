package com.datastructures;

public class Node {
    private Node nextNode;
    private Node previousNode;
    private String value;

    Node(String value){
     this.value = value;
    }

    Node(String value,Node previousNode){
        this(value);
        this.previousNode=previousNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    public String getValue(){
        return this.value;
    }
    public Node getPreviousNode(){
        return this.previousNode;
    }
}
