package top.uaian.algorithm.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        MergeSortMethod(arr, 0, arr.length -1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void MergeSortMethod(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }

        int len = arr.length;
        int mid = (start + end) / 2;
        MergeSortMethod(arr, start, mid);
        MergeSortMethod(arr, mid + 1, end);

        Merge(arr, start, mid, end, len);
    }

    private static void Merge(int[] arr, int start, int mid, int end, int len) {
        int[] tmpArray = new int[len];
        int secondStart = mid + 1;
        int tmpIndex = start;
        int finalStartIndex = start;
        while (secondStart <= end && start <= mid){
            if(arr[start] <= arr[secondStart]){
                tmpArray[tmpIndex++] = arr[start++];
            }else {
                tmpArray[tmpIndex++] = arr[secondStart++];
            }
        }

        while (secondStart <= end){
            tmpArray[tmpIndex++] = arr[secondStart++];
        }

        while (start <= mid){
            tmpArray[tmpIndex++] = arr[start++];
        }

        while (finalStartIndex <= end){
            arr[finalStartIndex] = tmpArray[finalStartIndex++];
        }
    }
}
