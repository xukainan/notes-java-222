package top.uaian.algorithm.sort;

/**
 * 桶排序
 */
public class BucketSort {


    private static int[] BucketSortMethod(int[] arr) {
        //准备一个覆盖待排序数组最小到最大的桶
        int[] bucket = new int[20];
        for (int i = 0; i < arr.length; i++) {
            //桶里放的值为原数组中值等于该桶的数量
            bucket[arr[i]]++;
        }
        return bucket;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        int[] bucket = BucketSortMethod(arr);
        for (int i = 0; i < bucket.length; i++) {
            //输出时要按照桶的数量进行输出
            for (int j = 0; j < bucket[i]; j++) {
                System.out.println(i);
            }
        }
    }
}
