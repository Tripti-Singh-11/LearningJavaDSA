package MultiDimensionalArrays;
import java.util.*;
public class MultiArrayLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> a =new ArrayList<>();
        a.add(10);a.add(20); a.add(30);
        List<Integer> b =new ArrayList<>();
        b.add(40);b.add(20); 
        List<Integer> c =new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(40);d.add(20);  d.add(40);
        List<List<Integer>> l=new ArrayList<>();
        l.add(a);l.add(b); l.add(c); l.add(d);

        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i)+" ");
        }
        for(int i=0; i<l.size();i++){
            System.out.println(l.get(i)+" ");
        }
    }
}

