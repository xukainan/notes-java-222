package top.uaian.algorithm.leecode;

public class KthLargestElementInAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        System.out.println(findKthLargest(arr, 3));
    }

    public static int findKthLargest(int[] nums, int k) {
        shellSort(nums);
        return nums[k-1];
    }

    private static void shellSort(int[] nums) {
        int len = nums.length;
        for (int step = len/2; step >= 1; step/=2) {
            for (int i = step; i < len; i++) {
                int j = i;
                int standard = nums[i];
                while (j - step >=0 && nums[j-step] < standard){
                    nums[j] = nums[j-step];
                    j-=step;
                }
                nums[j] = standard;
            }
        }
    }
}
