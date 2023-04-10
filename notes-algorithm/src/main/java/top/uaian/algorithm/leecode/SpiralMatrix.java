package top.uaian.algorithm.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        //[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int tmpIndex = 0;
        while (true){
            tmpIndex = left;
            while (tmpIndex <= right){
                list.add(matrix[top][tmpIndex++]);
            }
            if(++top > bottom)
                break;
            tmpIndex = top;
            while (tmpIndex <= bottom){
                list.add(matrix[tmpIndex++][right]);
            }
            if(--right < left)
                break;
            tmpIndex = right;
            while (tmpIndex >= left){
                list.add(matrix[bottom][tmpIndex--]);
            }
            if(--bottom < top)
                break;
            tmpIndex = bottom;
            while (tmpIndex >= top){
                list.add(matrix[tmpIndex--][left]);
            }
            if(++left > right)
                break;
        }
        return list;
    }
}
