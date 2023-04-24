package top.uaian.algorithm.leecode;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        findMedianSortedArrays(nums1, nums2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if(m > n)
            return findMedianSortedArrays(nums2, nums1);

        int leftElementNumsAll = (m + n + 1) / 2;
        int start = 0;
        int end = m;

        while (start < end){
            int i = (start + end + 1) / 2;
            int j = leftElementNumsAll - i;
            if(nums1[i-1] > nums2[j]){
                end = i-1;
            }else {
                start = i;
            }
        }

        int i = start;
        int j = leftElementNumsAll - start;

        int num1LeftNum = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int num1RightNum = i == m ? Integer.MAX_VALUE : nums1[i];
        int num2LeftNum = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int num2RightNum = j == n ? Integer.MAX_VALUE : nums2[j];

        if((m + n) % 2 == 0){
            return (double)(Math.max(num1LeftNum, num2LeftNum) + Math.min(num2RightNum, num1RightNum)) / 2;
        }else {
            return Math.max(num1LeftNum, num2LeftNum);
        }

    }

}
