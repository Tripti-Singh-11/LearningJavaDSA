package BinarySearch.Assignment;
public class SearchInRotatedSortedArrayWithRepeated {
public static boolean search(int[] nums, int target) {
    int lo = 0, hi = nums.length - 1;
    while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    if (nums[mid] == target) {
        return true;
    }
    if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
        lo++;
        hi--;
    }
    else if (nums[lo] <= nums[mid]) {
    if (nums[lo] <= target && target < nums[mid]) {
        hi = mid - 1;
    } else {
        lo = mid + 1;
    }
    }
    else {
    if (nums[mid] < target && target <= nums[hi]) {
        lo = mid + 1; 
    } else {
        hi = mid - 1; 
    }
    }
}
    return false; 
}
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        int target2 = 3;
        System.out.println(search(nums1, target1));
        System.out.println(search(nums1, target2)); 
        int[] nums2 = {4, 5, 6, 6, 7, 0, 1, 2, 4, 4};
        int target3 = 6;
        int target4 = 8;
        System.out.println(search(nums2, target3)); 
        System.out.println(search(nums2, target4)); 
        }
    }
    
