package BinarySearch.Assignment;
public class StaircaseCoins {
public static int arrangeCoins(int n) {
    int lo = 0;
    int hi = n;
    int result = 0;
    while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    long coinsNeeded = (long) mid * (mid + 1) / 2;  
    if (coinsNeeded == n) {
    return mid; 
    }
    if (coinsNeeded < n) {
        result = mid;  
        lo = mid + 1;
    } else {
        hi = mid - 1;  
    }
    }
        return result;
}
    public static void main(String[] args) {
        int n = 8;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);
        }
    }
     

