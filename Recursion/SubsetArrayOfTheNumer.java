package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetArrayOfTheNumer {
    static void subset(int[] arr){
        List<List<Integer>> li =new ArrayList<>();
        li.add(new ArrayList<>());
        for(int num:arr){
            int n=li.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(li.get(i));
                internal.add(num);
                li.add(internal);
            }
        }
        System.out.println(li);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        subset(arr);
    }
}
