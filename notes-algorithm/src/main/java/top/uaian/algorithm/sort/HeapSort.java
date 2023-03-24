package top.uaian.algorithm.sort;

import top.uaian.utils.ArrayUtils;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        HeapSortMethod(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void HeapSortMethod(int[] arr) {
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            transferMinHeap(arr, i, len);
        }

        for (int i = len - 1; i > 0; i--) {
            ArrayUtils.swap(arr, i, 0);
            transferMinHeap(arr, 0, i);
        }
    }

    private static void transferMinHeap(int[] arr, int i, int len) {
        int min = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < len && arr[left] < arr[min])
            min = left;
        if(right < len && arr[right] < arr[min])
            min = right;

        if(min != i) {
            ArrayUtils.swap(arr, min, i);
            transferMinHeap(arr, min, len);
        }
    }
}
