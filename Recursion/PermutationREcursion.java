package Recursion;

import java.util.List;

public class PermutationREcursion {
    static void permutation(String str){
        permutationHelper("",str);
    }
    static void permutationHelper(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            String st=p.substring(0, i);
            String en=p.substring(i);
            permutationHelper(st+up.charAt(0)+en, up.substring(1));
        }

    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str);
    }
}
