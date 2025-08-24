package HashmapAndHashSet;

import java.util.HashSet;

public class SetIterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {3,4,3,5,6,7,8};
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        for(int ele:set){
            System.out.print(ele + " ");
        }
         System.out.println("size  "+set.size()+" ");
        System.out.println();
        set.add(200);
        set.add(30); //number cann't be repeated
        System.out.println(set+" ");
        System.out.println("size  "+set.size()+" ");
        set.clear();
        System.out.println(set+" ");
        System.out.println("size  "+set.size()+" ");
        set.add(200);
        set.add(30);
        System.out.println(set+" ");
        System.out.println("size  "+set.size()+" ");
    }
}
