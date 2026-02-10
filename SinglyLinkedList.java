

public class SinglyLinkedList {
    int size;
    SinglyLinkedList(){
        size=0;
    }
    Node head;
    Node tail;
    class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data=data;
        }

    }
    public void addFirst(int data){
       Node node=new Node(data);
       if(head==null){
        head=node;
        tail=node;
        return;
       }
       node.next=head;
       head=node;
    }
    public void addLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        tail=node;

    }
    public int deleteFirst(){
        Node temp=head;
        if(temp==null){
            return -1;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return temp.data;
        }
        head=head.next;
        return temp.data;
    }
    public int deleteLast(){
        
        if(head==null){
            return -1;
        }
        Node temp=head;
        if(head==tail){
            head=null;
            tail=null;
            return temp.data;
        }
        return temp.data;
    }
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    
    }
    public void addREc(int value,int idx){
        helper(value,idx,head);
    }
    private Node helper(int val,int idx,Node prev){
          if(idx==0){
            Node node=new Node(val);
            node.next=prev.next;
            prev.next=node;
            return node;
          }
          Node node=helper(val, --idx, prev.next);
          return node;
    }
 
}
