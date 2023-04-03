package top.uaian.algorithm.leecode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] stockPrices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(stockPrices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int len = prices.length;
        int minPirce = prices[0];
        for (int i = 1; i < len; i++) {
            maxProfit = Math.max(prices[i] - minPirce, maxProfit);
            if(prices[i] < minPirce)
                minPirce = prices[i];
        }
        return maxProfit;
    }
}
