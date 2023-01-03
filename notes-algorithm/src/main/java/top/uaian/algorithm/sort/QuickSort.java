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

    private static void QuickSortMethod(int[] arr, int start , int end) {
        //start > end 结束所有递归循环
        if(start > end){
            return;
        }

        //left, right用来传递给递归方法开始和结束，因为如果使用start,end。（start,end）在执行完第一轮递归以后值会改变，导致第二轮不准确
        int left = start, right = end;
        int standard = arr[start];

        //right > left 一个基准数的比较已经完成
        while (left < right){
            //必须从右往左
            //首先从基准数开始， 从右往左找到一个数，与基准数交换
            //必须<= 否则遇到相同的数就死循环了
            while (arr[right] >= standard && left < right){
                right --;
            }
            arr[left] = arr[right];
            //从左往右找到符合条件的数，放到right上，之前right的数已经放到left上
            while (arr[left] <= standard && left < right){
                left ++;
            }
            arr[right] = arr[left];
        }
        //最后把基准数放到中间位置
        arr[right] = standard;

        QuickSortMethod(arr, start, right - 1);
        QuickSortMethod(arr, right + 1, end);
    }
}
