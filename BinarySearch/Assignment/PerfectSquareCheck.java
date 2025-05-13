package BinarySearch.Assignment;
public class PerfectSquareCheck {
public static boolean isPerfectSquare(int n) {
    if (n < 0) return false;  
    if (n == 0 || n == 1) return true;
    int lo = 1, hi = n / 2;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        int square =  mid * mid;
        if (square == n) {
        return true; 
        } else if (square < n) {
        lo = mid + 1;
        } else {
        hi = mid - 1;
        }
    }
        return false; 
        }
        public static void main(String[] args) {
            int n = 45;
            if (isPerfectSquare(n)) {
                System.out.println(n + " is a perfect square");
            } else {
                System.out.println(n + " is not a perfect square");
            }
        }
    }
    

