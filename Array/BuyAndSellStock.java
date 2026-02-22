package Array;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices){
        int minPrice = prices[0];
        int res = 0;

        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            res = Math.max(res, prices[i] - minPrice);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
