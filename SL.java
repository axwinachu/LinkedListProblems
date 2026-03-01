public class SL {
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        Node(int data){
           this.data=data;
        }
    }
    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void addNode(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=head;
            return;
        }
        tail.next=node;
        tail=node;
    }
    Node rec(Node temp, int data,int idx){
        if(idx==0){
            Node node=new Node(data);
            node.next=temp;
            return node;
        }
       temp.next=rec(temp.next, data,idx-1);
       return temp;
    }
    int count=0;
    Node recRev(Node temp,int data,int idx){
    
        if(count==idx){
            Node node=new Node(data);
            return node;
        }
        temp.next=rec(temp.next, data, idx-1);
        count++;
        return temp;
    
    }
    public static void main(String[] args) {
        SL ll=new SL();
        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.rec(ll.head, 99, 2);
        ll.recRev(ll.head, 100, 4);
        ll.display();
    }
}
