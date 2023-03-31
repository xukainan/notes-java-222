package top.uaian.algorithm.leecode;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int targetIndex = -1;
        int left = 0, right = nums.length -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(target == nums[mid]){
                return mid;
            } else if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid;
                }else {
                    left = mid + 1;
                }
            }else {
                if(target > nums[mid] && target <= nums[right]){
                    left = mid;
                }else {
                    right = mid - 1;
                }
            }

        }
        return targetIndex;
    }
}
