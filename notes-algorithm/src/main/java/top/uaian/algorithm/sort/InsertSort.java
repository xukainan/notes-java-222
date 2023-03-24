package top.uaian.algorithm.sort;

import top.uaian.utils.ArrayUtils;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        InsertSortMethod(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void InsertSortMethod(int[] arr) {
        int len = arr.length;
        //循环待排序的数的下标
        for (int i = 1; i < len; i++) {
            //待排序的数值
            int curVal = arr[i];
            //指针指向已经排序好的数
            int cursor = i - 1;
            while (cursor >= 0 && arr[cursor] > curVal){
                arr[cursor + 1] = arr[cursor];
                cursor--;
            }
            arr[cursor + 1] = curVal;
        }
    }

//    private static void InsertSortMethod(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i; j >= 0; j--) {
//                int tmp = j + 1;
//                if(arr[tmp] < arr[j]){
//                    ArrayUtils.swap(arr, tmp, j);
//                }
//            }
//        }
//    }
}
