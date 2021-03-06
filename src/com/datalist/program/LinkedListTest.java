package com.datalist.program;

/**
 * @author chenjunlin
 * @date 2019-01-04
 */

/**
 * 在一次遍历中，怎样发现单个链表的中间元素?
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));

        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;

        while (current.next() != null){
            length++;
            if (length%2 == 0){
                middle = middle.next();
            }
            current = current.next();
        }
        if (length%2 == 1){
            middle = middle.next();
        }

        System.out.println("length of linkedlist : "+length);
        System.out.println("middle element of linkedlist : "+middle);
    }
}
    class LinkedList{
        private Node head;
        private Node tail;

        public LinkedList(){
            this.head = new Node("head");
            tail = head;
        }

        public Node head(){
            return head;
        }

        public void add(Node node){
            tail.next = node;
            tail = node;
        }

        public static class Node{
            private Node next;
            private String data;

            public Node(String data){
                this.data = data;
            }

            public String data(){
                return data;
            }

            public void setData(String data){
                this.data = data;
            }
            public Node next(){
                return next;
            }
            public void setNext(Node next){
                this.next = next;
            }
            @Override
            public String toString(){
                return this.data;
            }
        }
    }

