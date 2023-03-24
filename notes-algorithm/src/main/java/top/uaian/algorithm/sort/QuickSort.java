package top.uaian.algorithm.sort;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        QuickSortMethod(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void QuickSortMethod(int[] arr, int start, int end) {
        int standard, left, right;

        //结束所有的子序列递归
        if(end < start){
            return;
        }

        //标准值
        standard = arr[start];
        left = start;
        right = end;

        //按照标准值进行一趟排序
        while (left < right){
            while (arr[right] >= standard && left < right){
                right--;
            }
            arr[left] = arr[right];
            while (arr[left] <= standard && left < right){
                left++;
            }
            arr[right] = arr[left];
        }

        //排序完成后，所在的中间位置为标准值，前面位置都小于标准值，后面位置都大于标准值
        //第一趟排序完：[6, 1, 2, 4, 3, 4, 5, 7, 13, 10, 8, 13]
        arr[right] = standard;


        //递归所有的子序列
        QuickSortMethod(arr, start, right - 1);
        QuickSortMethod(arr, right + 1, end);

    }
}
