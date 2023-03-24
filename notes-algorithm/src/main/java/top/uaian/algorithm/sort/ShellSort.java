package top.uaian.algorithm.sort;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        ShellSortMethod(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void ShellSortMethod(int[] arr) {
        int len = arr.length;
        for (int step = len; step >= 1; step/=2) {
            for (int i = step; i < len ; i++) {
                int j = i;
                int standard = arr[i];
                while (j - step >= 0 && arr[j - step] > standard) {
                    arr[j] = arr[j-step];
                    j=j-step;
                }
                arr[j] = standard;

            }
        }
    }
}
