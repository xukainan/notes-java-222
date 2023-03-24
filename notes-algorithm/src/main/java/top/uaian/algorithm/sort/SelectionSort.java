package top.uaian.algorithm.sort;

import top.uaian.utils.ArrayUtils;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        SelectionSortMethod(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void SelectionSortMethod(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            //选择最小的值
            int min = i + 1;
            for (int k = i + 1; k < len; k++) {
                if(arr[k] < arr[min]){
                    min = k;
                }
            }
            //比较当前值和后续的最小值
            if(arr[min] < arr[i]){
                ArrayUtils.swap(arr, min, i);
            }
        }
    }
}
