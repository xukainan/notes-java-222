package top.uaian.algorithm.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String str) {
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> bucket= new HashMap<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char cur = str.charAt(i);
            if(bucket.containsKey(cur)){
                maxLen = Math.max(i - start, maxLen);
                //如果当前重复值+1（新的开始位置）小于上一波的开始值，则还使用上一波的开始值，如“abbacd”
                start = Math.max(bucket.get(cur) + 1, start);
            }
            bucket.put(cur, i);
        }
        //测量最后一组无重复值的字符串长度，或者字符串本身无重复值
        maxLen = Math.max(len - start, maxLen);
        return maxLen;
    }
}
