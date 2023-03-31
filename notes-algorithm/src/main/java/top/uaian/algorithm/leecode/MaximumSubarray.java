package top.uaian.algorithm.leecode;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(sum > 0){
                sum = sum + nums[i];
            }else {
                sum = nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
