package top.uaian.algorithm.leecode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "ac";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2)
            return s;
        int start = 0;
        int maxLen = 1;
        boolean[][] dp = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int L = 2; L <= len; L++) {
            for (int l = 0; l < len; l++) {
                int r = l + L - 1;
                if(r >= len)
                    break;
                if(s.charAt(l) != s.charAt(r)){
                    dp[l][r] = false;
                }else {
                    if(r - l < 3){
                        dp[l][r] = true;
                    }else {
                        dp[l][r] = dp[l+1][r-1];
                    }
                }

                if(dp[l][r] && (r - l + 1) > maxLen){
                   maxLen =  r - l + 1;
                   start = l;
                }
            }
        }


        return s.substring(start, start + maxLen);
    }
}
