public class Slinked {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void addIn(Node temp,int data,int idx){
        if(idx==0){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return;
        }
        if(idx==1){
            Node newNode=new Node(data);
            newNode.next=temp.next;
            temp.next=newNode;
            return;
        }
        addIn(temp.next, data, idx-1);
    }
    Node delete(Node temp,int data){
        if(temp.data==data){
            return temp.next;
        }
       temp.next=delete(temp.next, data);
       return temp;
    }
    Node reverse(Node temp){
        if(temp==null){
            return temp;
        }
        Node newHead=temp;
        System.out.println("newHEAD"+newHead.data);
        reverse(temp.next).next=
    }
    public static void main(String[] args) {
        Slinked ll=new Slinked();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll.reverse(ll.head).data);
        ll.display();
    }
}
