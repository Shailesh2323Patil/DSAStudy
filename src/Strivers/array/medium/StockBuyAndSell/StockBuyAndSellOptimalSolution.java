package Strivers.array.medium.StockBuyAndSell;

public class StockBuyAndSellOptimalSolution {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        int size = prices.length;

        for(int i=0; i<size; i++) {
            minValue = Math.min(prices[i], minValue);
            maxValue = Math.max(prices[i]-minValue, maxValue);
        }

        return maxValue;
    }
}
