package top.uaian.algorithm.sort;


import top.uaian.utils.ArrayUtils;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        BubbleSortMethod(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void BubbleSortMethod(int[] arr) {
        int len = arr.length;
        //已经排好序的部分
        for (int i = 0; i < len - 2; i++) {
            //未排好序的部分依次冒泡
            for (int j = len - 1; j > i; j--) {
                if(arr[j] < arr[j - 1]){
                    ArrayUtils.swap(arr, j, j - 1);
                }
            }
        }
    }
}
