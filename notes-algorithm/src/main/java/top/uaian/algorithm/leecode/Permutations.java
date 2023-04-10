package top.uaian.algorithm.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        backTrack(nums, list, lists);
        return lists;
    }

    private static void backTrack(int[] nums, LinkedList<Integer> list, List<List<Integer>> lists) {

        if(list.size() == nums.length){
            lists.add(new ArrayList<>(list));
            return;
        }

        for (int num : nums) {
            if(list.contains(num)){
                continue;
            }
            list.add(num);
            backTrack(nums, list, lists);
            list.removeLast();
        }

    }

}
