package Recursion.Assignment;
class Solution {
    public int longestCommonSubstring(String s1, String s2, int i, int j, int count) {
        if (i == s1.length() || j == s2.length()) {
            return count;
        }
        int matchCount = count;
        if (s1.charAt(i) == s2.charAt(j)) {
            matchCount = longestCommonSubstring(s1, s2, i + 1, j + 1, count + 1);
        }
        int skipS1 = longestCommonSubstring(s1, s2, i + 1, j, 0);
        int skipS2 = longestCommonSubstring(s1, s2, i, j + 1, 0);
        return Math.max(matchCount, Math.max(skipS1, skipS2));
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "abcde";
        String s2 = "abfce";
        System.out.println(sol.longestCommonSubstring(s1, s2, 0, 0, 0)); 
    }
}
