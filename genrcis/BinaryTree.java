package genrcis;

public class BinaryTree {
    Node root;
    class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
           this.val=val;
        }    
    }
    Node insert(int data){
        if(root==null){
           root=new Node(data);
           return root;
        }
        return insert(data,root);
    }
    Node insert(int data,Node node){
        if(node==null){
            Node newNode=new Node(data);
            return newNode;
        }
        if(node.val>data){
             node.left=insert(data, node.left);
        }else{
            node.right=insert(data, node.right);
        }
        return node;
    }

   void display(Node temp){
      if(temp==null){
        return;
      }
      System.out.println(temp.val);
      display(temp.left);
      display(temp.right);
    }
    
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(12);
        binaryTree.insert(4);
        binaryTree.insert(20);
        binaryTree.display(binaryTree.root);
    
    }
}
