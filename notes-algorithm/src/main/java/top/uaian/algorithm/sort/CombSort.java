package top.uaian.algorithm.sort;

import top.uaian.utils.ArrayUtils;

/**
 * 梳排序
 */
public class CombSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        CombSortMethod(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void CombSortMethod(int[] arr) {
        int len = arr.length;
        int step = len;
        //步长每次除1.3直至最小步长1
        while ((step = (int)(step/1.3)) >= 1){
            //从步长开始，依次比较当前值和相距步长的的值
            for (int i = step; i < len; i++) {
                if(arr[i] < arr[i-step]){
                    ArrayUtils.swap(arr, i, i-step);
                }
            }
        }
    }
}
