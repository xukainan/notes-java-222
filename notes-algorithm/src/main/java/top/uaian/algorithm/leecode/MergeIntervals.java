package top.uaian.algorithm.leecode;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,4},{2,3}};
        int[][] merge = merge(intervals);
        System.out.println(merge);
    }


    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        List<int[]> lists = new ArrayList<>();
        quickSortArrays(intervals, 0, len - 1);
        for (int i = 0; i < len; i++) {
            int[] arr = new int[2];
            arr[0] = intervals[i][0];
            int right = intervals[i][1];
            while (i + 1 < len && right >= intervals[i + 1][0]){
                right = Math.max(right, intervals[i + 1][1]);
                i++;
            }
            arr[1] = right;
            lists.add(arr);
        }
        return lists.toArray(new int[lists.size()][]);
    }

    private static void quickSortArrays(int[][] intervals, int start, int end) {
        int i, j;
        int[] standard;
        if(start > end)
            return;

        i = start;
        j = end;
        standard = intervals[start];

        while (i < j){
            while (i < j && intervals[j][0] >= standard[0]){
                j--;
            }
            intervals[i] = intervals[j];
            while (i < j && intervals[i][0] <= standard[0]){
                i++;
            }
            intervals[j] = intervals[i];
        }
        intervals[j] = standard;

        quickSortArrays(intervals, start, j - 1);
        quickSortArrays(intervals, j + 1 , end);


    }
}
