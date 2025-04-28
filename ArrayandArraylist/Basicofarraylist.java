package ArrayandArraylist;
import java.util.*;
public class Basicofarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new  ArrayList<>(6);
        arr.add(0,30);
        arr.add(1,40);
        arr.add(2,50);
        arr.add(3,90);
        arr.add(4,20);
        arr.add(5,10);
        System.out.println("Size of array : " + arr.size());
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
                System.out.println();
                arr.set(2,68); //modify
                arr.add(500);
                    for(int i=0;i<arr.size();i++){
                    System.out.println(arr.get(i)+" ");
                    }
    }
}

 
