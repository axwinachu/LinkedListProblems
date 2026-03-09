package Recursion;

public class LinkedL {
    Node head;
    Node tail;
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
                tail=head;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        void disaply(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("END");
        }
        Node reverse(Node temp){
           if(temp.next==null){
            head=temp;
            return head;
           }
           Node n=reverse(temp.next);
           n.next=temp;
           temp.next=null;
           return temp;

        }
        void reverse(){
            Node cur=head;
            Node pre=null;
            
            while (cur!=null ) {
                Node ne=cur.next;
                cur.next=pre;
                pre=cur;
                cur=ne;
            }
            head=pre;
        }
    public static void main(String[] args) {
        LinkedL li=new LinkedL();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.reverse();
        li.disaply();
    }
}
