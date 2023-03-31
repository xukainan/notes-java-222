package top.uaian.algorithm.leecode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] lists = twoSum(nums, target);
        System.out.println(lists);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> bucket = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(bucket.containsKey(nums[i])){
                return new int[]{i, bucket.get(nums[i])};
            }else {
                bucket.put(target - nums[i], i);
            }
        }

        return new int[]{};
    }
}
