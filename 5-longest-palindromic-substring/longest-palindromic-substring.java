class Solution {
    public String longestPalindrome(String s) {
        //fallback
        if(s.length() < 1 || s == null){
            return s;
        }

        //dynamic programming approach
        int n = s.length();
        boolean[][] dp = new boolean[n][n]; //the size is the s.length()

        int start = 0; //beginning of possible palindrome
        int maxLen = 1; //max length of palindrome, default is 1 as single letter is a palindrome

        for(int i = 0; i < n; i++){
            dp[i][i] = true; //initialize every letter
            for(int j = 0; j < i; j++){
                if(s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j+1][i - 1])){
                    dp[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                    }
                }
            }
        } 
        return s.substring(start, start + maxLen);
    }
}