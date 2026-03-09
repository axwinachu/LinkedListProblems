package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubleSortUsingrecursion {
    static void bubleSort(int[] arr,int r,int c){
      if(r==0){
        return;
      }
      if (r>c) {
        if(arr[c]>arr[c+1]){
        int temp=arr[c];
        arr[c]=arr[c+1];
        arr[c+1]=temp;
        bubleSort(arr, r, c+1);
      }else{
        bubleSort(arr, r, c+1);
      }
      }else{
        bubleSort(arr, r-1, 0);
      }
      
    }
    static void print(int r,int c){
        if(r==0){
            return;
        }
        if(r<=c){
         System.out.println();
         print(r-1, 0);
        }else{
            System.out.print("*");
        print(r, c+1);
        }
        
    }
    public static void main(String[] args) {
        print(2,0);
        int[] arr={5,4,3,2,1};
        bubleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
