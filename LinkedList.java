public class LinkedList {
    int size;
    LinkedList(){
        this.size=0;
    }
    Node head=null;
    Node tail=null;
 public class Node {
    int data;
    Node next;
   Node(int data){
     this.data=data;
     size++;
   }
 }
 public void addFirst(int val){
    Node node=new Node(val);
    if(head==null){
        head=node;
        tail=node;
        return;
    }
    
    node.next=head;
    head=node;
 }
 public void addLast(int val){
    Node node=new Node(val);
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
    while (temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("end");
 }
 public void addIndex(int val,int idx){
    if(idx>=size){
    addLast(val);
    return;
   }
   if (idx==0) {
    addFirst(val);
    return;
   }
   Node temp=head;
   for(int i=0;i<idx-1;i++){
      temp=temp.next;
   }
   Node node=new Node(val);
   node.next=temp.next;
   temp.next=node;
 }
 
} 
class Main {
public static void main(String[] args) {
    LinkedList li=new LinkedList();
    li.addFirst(1);
    li.addFirst(2);
    li.addFirst(3);
    li.addIndex(10, 0);
    li.display();
    System.out.println(li.size);
} 
}
