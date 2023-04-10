package top.uaian.algorithm.leecode;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{5};
        System.out.println(search(nums, 5));
    }


    public static int search(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return index;
    }
}
