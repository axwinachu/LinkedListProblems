package genrcis;

import java.util.ArrayList;
import java.util.List;

class ArrayL<T>{
    private Object[] arr;
    private static int length=10;
    private int pointer;

    ArrayL(){
        arr=new Object[length];
    }
    void add(T data){
      if(isFull()){
        resize();
      }
      arr[pointer++]=data;
    }
    private boolean isFull(){
        return arr.length==pointer;
    }
    private void resize(){
        Object[] temp=new Object[length*2];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    public T get(int i){
        return (T) arr[i];
    }
    public int size(){
        return pointer;
    }

}
public class CustomArrayList {
    static void print(List<?> data){
       System.out.println(data);
    }
    public static void main(String[] args) {
        ArrayL<Integer> arr=new ArrayL<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        List<String> str=List.of("aswin","abi","jafer");
        List<Integer> num=List.of(1,2,3,4);
        print(num);
        print(str);
       

    } 
}

