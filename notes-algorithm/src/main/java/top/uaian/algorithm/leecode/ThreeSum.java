package top.uaian.algorithm.leecode;

import top.uaian.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        heapSort(nums);
        for (int i1 = 0; i1 < len - 2; i1++) {
            int cur = nums[i1];
            int start = i1 + 1, end = len - 1;
            if(i1 > 0 && cur == nums[i1-1]){
                continue;
            }
            while (start < end){
                if(nums[start] + nums[end] + cur == 0){
                    List<Integer> list = new ArrayList<>();

                    list.add(nums[start]);
                    list.add(nums[end]);
                    list.add(cur);
                    lists.add(list);
                    while (start < end && nums[start] == nums[start+1]){
                        start++;
                    }
                    start++;
                    while (start < end && nums[end] == nums[end-1]){
                        end--;
                    }
                    end--;
                }else if(nums[start] + nums[end] + cur < 0){
                    start++;
                }else {
                    end--;
                }
            }
        }


        return lists;
    }

    private static void heapSort(int[] nums) {
        int len = nums.length;
        for (int i = len/2 - 1; i >= 0; i--) {
            transTopHeap(nums, i , len);
        }

        for (int j = len - 1; j > 0; j--) {
            ArrayUtils.swap(nums, 0, j);
            transTopHeap(nums, 0 ,j);
        }
    }

    private static void transTopHeap(int[] nums, int i, int len) {
        int left  = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;
        if(left < len && nums[max] < nums[left])
            max = left;
        if(right < len && nums[max] < nums[right])
            max = right;

        if(max != i) {
            ArrayUtils.swap(nums, i, max);
            transTopHeap(nums, max, len);
        }
    }
}
