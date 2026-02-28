package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationREcursion {
    static void permutation(String str){
        //                                                                                                                                   

        List<String> res=permutationHelper2("",str);
        System.out.println(res);
    }
    static List<String> permutationHelper2(String p,String up){
        if(up.isEmpty()){
            List<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String> res=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String st=p.substring(0, i);
            String en=p.substring(i);
            
            res.addAll(permutationHelper2(st+up.charAt(0)+en, up.substring(1)));
        }
        return res;
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
