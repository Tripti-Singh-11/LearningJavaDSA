package HashmapAndHashSet;

import java.util.HashMap;
public class BasicMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();    
        map.put("Tanya", 70);
        map.put("Nikki", 50);
        map.put("Ananya", 60);
        map.put("Tripti", 80);
        System.out.println(map+ " "+ map.size());
        map.put("Lovely", 60);
        System.out.println(map+ " "+ map.size());
        System.out.println(map.containsValue(60));
        map.remove("Nikki");
        System.out.println(map+ " "+ map.size());
        System.out.println(map.get("Lovely"));
        }
}

