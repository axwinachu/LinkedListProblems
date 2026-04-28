package genrcis;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public Node insertNode(int data){
    if(root==null){
        root=new Node(data);
        return root;
    }
    Queue<Node> queue=new LinkedList<>();
    queue.add(root);
        while (!queue.isEmpty()) {
            Node temp=queue.poll();
            if(temp.left==null){
                temp.left=new Node(data);
                return  temp.left;
            }else{
                queue.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new Node(data);
                return temp.right;
            }else{
                queue.add(temp.right);
            }
        }
        return null;
    }

    public static void main(String[] args) {

        BinaryTreeImplementation btree=new BinaryTreeImplementation();
        btree.insertNode(10);
        btree.insertNode(20);
        btree.insertNode(30);
        btree.insertNode(40);
        
    }
}
