package HashmapAndHashSet;

import java.util.HashSet;

public class CountDistinctInteger {

    public static void main(String[] args) {
        int[] nums = {1, 13, 10, 12, 31};
        CountDistinctInteger obj = new CountDistinctInteger();
        obj.countDistinctIntegers(nums);
    }

    public void countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }

        // Print all distinct integers
        System.out.println("Distinct integers (including reversed):");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println(); // line break

        // Print the total count
        System.out.println("Total distinct integers: " + set.size());
    }

    public int reverse(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
}
