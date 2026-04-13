package Recursion;


import java.util.Arrays;
class Main {
    static void bubleSort(int[] arr,int r,int c){
        if(c==r){
            bubleSort(arr,r-1,0);
        }
        if(arr[c]<arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        bubleSort(arr,r,c+1);
        
    }
    public static void main(String[] args) {
        int[] arr={12,2,3,34,21,32,34,234};
        bubleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}