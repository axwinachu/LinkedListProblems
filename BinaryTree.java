
class Tree{
    Node rootNode;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public void addNode(int data){
        
        Node newNode=new Node(data);
        if(rootNode==null){
            rootNode=newNode;
            return;
        }
        Node temp=rootNode;
        while (true) {
            if(data<temp.data){
                if(temp.left==null){
                    temp.left=newNode;
                    break;
                }else{
                   temp=temp.left;          
                }
            }else{
                if(temp.right==null){
                    temp.right=newNode;
                    break;
                }else{
                   temp=temp.right;          
                }  
            }
        }
    }
    public void display(){
        helper(rootNode);
    }
    private void helper(Node temp){
        if(temp==null){
            return;
        }
        
        helper(temp.left);
        System.out.println(temp.data);
        helper(temp.right);
              
        
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Tree t=new Tree();
       
        t.addNode(1);
        t.addNode(2);
        t.addNode(3);
         t.display();
        
    }
}
