package Assignment4.Q1;

public class LinkedList<T>{

    private Node head;
    private int length;
    public LinkedList(){ this.length = 0;head = null; }

    public int length(){ return this.length; }

    public void addAtPosition(int index, int element) throws Exception{
        Node head = this.head;
        if (this.length<index) {
            throw new Exception("Index out of bounds");
        }
        if (index ==0) {
            Node temp = head;
            head = new Node(element);
            head.next = temp;
        }
        for (int i = 0; i< this.length; i++) {
            if (i==index-1) {
                Node temp = head.next;
                head.next = new Node(element);
                head.next.next = temp;
            } else {
                head = head.next;
            }
        }
    }
    public void removeAtPosition(int index, int element) throws Exception{
        Node head = this.head;
        if (this.length<index) {
            throw new Exception("Index out of bounds");
        }
        for (int i = 0; i< this.length; i++) {
            if (i==index-1) {
                Node temp = head.next;
                head.next = temp.next;
            } else {
                head = head.next;
            }
        }
    }
    public int getFirst() throws Exception{
        Node head = this.head;
        if (length==0) {
            throw new Exception("Empty Linked List");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        Node head = this.head;
        if (length==0) {
            throw new Exception("Empty Linked List");
        }
        while (head.next!=null) {
            head = head.next;
        }
        return head.data;
    }

    public int size(){
        return this.length;
    }
}
