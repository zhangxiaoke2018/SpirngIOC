package org.xk.Controller;

public class test {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.next  =node2;
        node2.next  =node3;
        node3.next  =node4;
        node4.next  =node5;
        node5.next  =node6;
        Node newHead = null;
        while(node1 != null){
            Node temp = node1.next;
            node1.next = newHead;
            newHead = node1;
        }


    }



}


