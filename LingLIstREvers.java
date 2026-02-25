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
   head=helper(head);
    
}
Node helper(Node temp){
  if(temp==null ||temp.next==null){
    return temp;
  }
 Node newHead=helper(temp.next);
 temp.next.next=temp;
 temp.next=null;
 return newHead;
  
}
void insertNode(int pos){
  head=helper2(pos,head);
}
Node helper2(int pos,Node temp){
    if(pos==0){
        Node newnode=new Node(99);
        newnode.next=temp;
        return newnode;
    }
    Node check=helper2(pos-1,temp.next);
     temp.next=check;
     return temp;
}
}

public class LingLIstREvers {
    public static void main(String[] args) {
        SLinkedList sl=new SLinkedList();
        sl.add(1);
        sl.add(10);
        sl.add(20);
        sl.insertNode(2);
        sl.add(50);
         sl.display();
    }
}


