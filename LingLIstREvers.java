class SLinkedList {
    Node head;
    Node tail;
 class Node {
     int data;
     Node next;
     Node(int data){
        this.data=data;
     }     
}
Node add(int data){
    Node newNode=new Node(data);
    if (head==null) {
        head=newNode;
        tail=head;
        return newNode;
    }
    tail.next=newNode;
    tail=newNode;
    return newNode;
}
void display(){
    Node temp=head;
    while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
    }
}
void displayrev(){
   helper(head);
    
}
void helper(Node temp){
  if(temp==null){
    return;
  }
  helper(temp.next);
  System.out.println(temp.data);
}
}
public class LingLIstREvers {
    public static void main(String[] args) {
        SLinkedList sl=new SLinkedList();
        sl.add(1);
        sl.add(10);
        sl.add(20);
        sl.add(50);
        sl.display();
        sl.displayrev();
        
    }
}

