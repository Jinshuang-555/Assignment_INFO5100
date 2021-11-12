package Assignment4.Q1;

import java.util.Collections;
import java.util.List;

public class LinkedList<T>{

    private Node head;
    private int length;

    public LinkedList(){
        this.length = 0;
        head = null;
    }

    public int length(){
        return this.length;
    }

    public void addAtPosition(int index, int element) {
        if (length<index) { return; }
        synchronized (this) {
            if (index ==0) {
                Node temp = head;
                head = new Node(element);
                head.next = temp;
            }
            for (int i = 0; i< length; i++) {
                if (i==index-1) {
                    Node temp = head.next;
                    head.next = new Node(element);
                    head.next.next = temp;
                } else {
                    head = head.next;
                }
            }
            length++;
        }
    }

    public void removeAtPosition(int idx) {
        if (this.length<idx) { return; }
        synchronized (this) {
            for (int i = 0; i< length; i++) {
                if (i==idx-1) {
                    Node temp = head.next;
                    head.next = temp.next;
                } else {
                    head = head.next;
                }
            }
            length--;
        }
    }

    public int getFirst() throws Exception{
        if (length==0) {
            throw new Exception("Empty Linked List");
        }
        synchronized (this) {
            return head.data;
        }
    }

    public synchronized int getLast() throws Exception{
        Node head = this.head;
        if (length==0) {
            throw new Exception("Empty Linked List");
        }
        while (head.next!=null) {
            head = head.next;
        }
        return head.data;
    }

    public synchronized int size(){
        return this.length;
    }
}
