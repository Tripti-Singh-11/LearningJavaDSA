package HashmapAndHashSet;
import java.util.HashMap;
public class ItrerateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Tanya", 70);
        map.put("Nikki", 50);
        map.put("Ananya", 60);
        map.put("Tripti", 80);
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key + " "+ val);
        }
        for(int val : map.values()){
            System.out.println(val);
        }
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
