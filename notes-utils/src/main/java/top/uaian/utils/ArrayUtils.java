package top.uaian.utils;

public class ArrayUtils {
    public static void swap(int[] arr, int i, int j){
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
