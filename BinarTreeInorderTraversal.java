class BTree{
    Node root=null;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    void insertNode(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
            return;
        }
        Node temp=root;
        while (true) {
            if(data<temp.data){
                if(temp.left==null){
                    temp.left=newNode;
                    return;
                }else{
                    temp=temp.left;
                }
            }else{
                if(temp.right==null){
                    temp.right=newNode;
                    return;
                }else{
                    temp=temp.right;
                }
            } 
        }
    }
    void display(){
        helper2(root);
    }
    void helper2(Node temp){
        if(temp==null){
            return;
        }
        
        helper2(temp.left);
        System.out.println(temp.data);
        helper2(temp.right);
        
    }
}
public class BinarTreeInorderTraversal {
    public static void main(String[] args) {
        BTree bTree=new BTree();
        bTree.insertNode(1);
        bTree.insertNode(2);
        bTree.insertNode(3);
        bTree.display();
    }
}
