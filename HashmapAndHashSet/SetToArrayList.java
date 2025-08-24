package HashmapAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToArrayList {
     public static void main(String[] args) {
        // Step 1: Create a Set (HashSet used here)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        // Step 2: Convert Set to ArrayList
        List<String> list = new ArrayList<>(set);

        // Step 3: Print the ArrayList
        System.out.println("ArrayList: " + list);
    }
}
