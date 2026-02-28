package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    static void subset(String str){
       System.out.println(subsetHelper("",str));
    }
    static List<String> subsetHelper(String p,String up){
        if(up.isEmpty()){
            List<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String> li1=subsetHelper(p+up.charAt(0),up.substring(1));
        List<String> li2=subsetHelper(p, up.substring(1));
        li1.addAll(li2);
        return li1;

    }

    public static void main(String[] args) {
      String str="abc";
      subset(str);
    }
}
