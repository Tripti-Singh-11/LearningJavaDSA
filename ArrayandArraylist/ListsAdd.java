package ArrayandArraylist;
import java.util.*;
public class ListsAdd {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        System.out.println(List+" "+List.size());
        List.add(60);
        System.out.println(List+" "+List.size());
        List.add(64);
        System.out.println(List+" "+List.size());
        //remove
        List.remove(Integer.valueOf(90)); 
        System.out.println(List+" "+List.size());
        List.add(-60);
        System.out.println(List+" "+List.size());
        List.add(-80);
        System.out.println(List+" "+List.size());
        List.remove(Integer.valueOf(50)); 
        System.out.println(List+" "+List.size());
        List.add(30);
        System.out.println(List+" "+List.size());
    }
}
