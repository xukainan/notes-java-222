package top.uaian.algorithm.leecode;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = trap(height);
        System.out.println(trap);
    }

    public static int trap(int[] height) {
        int len = height.length;
        int[] leftMax = new int[len];
        leftMax[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int[] rightMax = new int[len];
        rightMax[len-1] = height[len - 1];
        for (int i = len-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trap = 0;
        for (int i = 0; i < len; i++) {
            trap += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trap;

    }
}
