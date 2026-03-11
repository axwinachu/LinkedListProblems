// Online Java Compiler
// Use this editor to write, compile and run your Java code onl
class SL{
    public Node head;
    public Node tail;
    class Node{
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
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void insert(int idx,int data){
        head=insertHelper(idx,data,head);
    }
    private Node insertHelper(int idx,int data,Node temp){
        if(idx==0){
            Node newNode=new Node(data);
            newNode.next=temp;
            return newNode;
        }
        temp.next=insertHelper(idx-1,data,temp.next);
        return temp;
        
    }
    void removeDuplicates(){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
            
        }
    }
   void mergeTwoLinkedList(Node l1,Node l2){
        Node temp1=l1;
        Node temp2=l2;
        Node head=new Node(0);
        Node p=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                p.next=temp1;
                temp1=temp1.next;
            }else{
                p.next=temp2;
                temp2=temp2.next;
            }
            p=p.next;
        }
        if(temp1!=null){
            p.next=temp1;
        }
        if(temp2!=null){
            p.next=temp2;
        }
        System.out.println("displaying merged List");
        Node tem=head;
        while(tem!=null){
            System.out.println(tem.data);
            tem=tem.next;
        }
    }
    Node getMid(Node head){
        Node s=head;
        Node f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    Node merger(Node l1,Node l2){
        Node temp1=l1;
        Node temp2=l2;
        Node head=new Node(0);
        Node p=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                p.next=temp1;
                temp1=temp1.next;
            }else{
                p.next=temp2;
                temp2=temp2.next;
            }
            p=p.next;
        }
        if(temp1!=null){
            p.next=temp1;
        }
        if(temp2!=null){
            p.next=temp2;
        }
       return head.next;
    }
    Node mergeSort(Node temp){
       if(temp==null || temp.next==null){
           return temp;
       }
       Node mid=getMid(temp);
       Node right=mergeSort(mid.next);
       mid.next=null;
       Node left=mergeSort(temp);
       return merger(left,right);
       
    }  
}
class Main {
    public static void main(String[] args) {
       SL ll=new SL();
       ll.add(10);
       ll.add(9);
       ll.add(2);
       ll.add(5);
       ll.add(6);
       ll.head=ll.mergeSort(ll.head);
       ll.display();
    
      
    }
}