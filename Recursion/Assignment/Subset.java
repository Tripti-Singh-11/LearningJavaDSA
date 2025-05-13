package Recursion.Assignment;

import java.util.*;
public class Subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Start with an empty subset
        
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> powerSet = subsets(nums);

        System.out.println("Power Set of " + Arrays.toString(nums) + ":");
        for (List<Integer> subset : powerSet) {
            System.out.println(subset);
        }
    }
}
