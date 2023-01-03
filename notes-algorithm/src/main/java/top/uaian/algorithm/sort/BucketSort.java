package top.uaian.algorithm.sort;

/**
 * 桶排序
 */
public class BucketSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 13, 4, 3, 8, 5, 10, 13, 4, 2, 6};
        int[] res = BucketSortMethod(arr);
        for (int i = 0; i < res.length; i++) {
            //输出时要按照桶的数量进行输出
            for (int j = 0; j < res[i]; j++) {
                System.out.println(i);
            }
        }
    }

    private static int[] BucketSortMethod(int[] arr) {
        //准备一个覆盖待排序数组最小到最大的桶
        int[] res = new int[20];
        for (int index = 0; index < arr.length; index++) {
            //桶里放的值为原数组中值等于该桶的数量
            res[arr[index]] += 1;
        }
        return res;
    }


}
