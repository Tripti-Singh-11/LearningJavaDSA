package HashmapAndHashSet;
import java.util.HashSet;
public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set =  new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set.size());
        System.out.println("Set is "+ set);
        set.remove(30);
        set.add(90);
        System.out.println(set);
        System.out.println(set.size());
        Object[] arr =  set.toArray();
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
    } 
    System.out.println();
    }
}
