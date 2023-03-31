package top.uaian.algorithm.leecode;

import top.uaian.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortArray(int[] nums) {
        int len = nums.length;
        quickSortImpl(nums, 0, len-1);
        return nums;
    }

    private static void quickSortImpl(int[] nums, int start, int end) {
        int left, right, standard;
        if(start >= end)
            return;

        left = start;
        right = end;
        standard = nums[left];
        while (left < right){
            while (left < right && nums[right] >= standard){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= standard){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[right] = standard;

        quickSortImpl(nums, start, right - 1);
        quickSortImpl(nums, right + 1, end);


    }
}
