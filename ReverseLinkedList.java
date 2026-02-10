class LinkedList {
  Node head;
  Node tail;
  public class Node {
      int data;
      Node next;
      Node(int data){
        this.data=data;
      }
      Node(int data,Node next){
        this.data=data;
        this.next=next;
      }
  }
  public void addLast(int data){
    Node node=new Node(data);
    if(head==null){
        head=node;
        tail=node;
        return;
    }
    tail.next=node;
    tail=node;
  }
  public void display(){
    Node temp=head;
    if(head==null){
        return;
    }
    while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
    }
    System.out.println("end");
  }
  public void reverseLinkedList(){
    Node prev=null;
    Node curr=head;
    while (curr!=null) {
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
  }
    
}
public class ReverseLinkedList {
   public static void main(String[] args) {
    LinkedList li=new LinkedList();
    li.addLast(1);
    li.addLast(2);
    li.addLast(3);
    li.addLast(4);
    li.reverseLinkedList();
    li.display();
   }
}