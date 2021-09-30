package com.datastructures;

import java.util.Objects;

public class DoubleLinkedImpl {

    Node head;
    int size=0;

    public boolean add(String s){
        if(Objects.nonNull(head)){
            Node nextNode = new Node(s,head);
            head.setNextNode(nextNode);
            head = nextNode;
        }
        else{
            head = new Node(s);
        }
        size++;
        return true;
    }

    public boolean remove(String s){
        return true;
    }

    public String get(int index){
        if(size!=0 && index < size){
            Node node = head;
            for(int i=size-1;i>=0;i--){
                if(index == i){
                    return node.getValue();
                }else{
                    node=node.getPreviousNode();
                }
            }
        }
        return null;
    }

    public void printElements(){
        Node node = head;
        int i = size;
        while(i > 0){
            System.out.println(node.getValue());
            node=node.getPreviousNode();
            i--;
        }


    }


}
