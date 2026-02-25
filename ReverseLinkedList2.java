class LinkedLisit{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
           tail=head;
           return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void removeDuplicates(){
        Node temp=head;
        while (temp!=null && temp.next!=null) {
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
            temp=temp.next;
            }
        }
    }
    void reverse(){
        Node temp=head;
        Node prev=null;
        Node post=null;
        if(head==null){
            return;
        }
        while (temp!=null) {
            post=temp.next;
            temp.next=prev;
            prev=temp;
            temp=post;
             
        }
        head=temp;
    }
    void reverseviaRecursion(){
        head= helper(head);
    }
    Node helper(Node temp){
        if (temp.next!=null) {
            return temp;
        }
        Node newHead=helper(temp.next);
        temp.next.next=temp;
        temp.next=null;
        return newHead;
    }
}
public class ReverseLinkedList2 {
    public static void main(String[] args) {
        LinkedLisit li=new LinkedLisit();
        li.addFirst(1);
        li.addFirst(1);
        li.addFirst(2);
        li.addFirst(3);
        li.addFirst(3);
        li.addFirst(4);
        li.addFirst(4);
        li.removeDuplicates();
        li.reverseviaRecursion();
        li.display();
    }
    
}
