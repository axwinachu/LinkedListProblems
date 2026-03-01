package Recursion;

public class AmazoneDiceProblem {
    static void diece(String p,int target){
    if(target==0){
        System.out.println(p);
        return;
    }
    for(int i=1;i<=6 && i<target;i++){
        diece(p+i, target-i);
    }
    }
    public static void main(String[] args) {
       diece("", 4); 
    }
}
