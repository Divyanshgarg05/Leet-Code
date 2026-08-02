class Solution {

    private int recursive(int idx, int[] prices, int bought) {

        if(idx >= prices.length){
            return 0;
        }

        int profit = 0;
        if(bought == 0){
            int buy = recursive(idx + 1, prices, 1) - prices[idx];
            int notBuy = recursive(idx + 1, prices, 0);
            profit = Math.max(buy, notBuy);
        }else{
            int sell = recursive(idx + 2, prices, 0) + prices[idx];
            int notSell = recursive(idx + 1, prices, 1);
            profit = Math.max(sell, notSell);
        }

        return profit;
    }
    
    private int memoization(int idx, int[] prices, int bought, int[][] dp) {

        if(idx >= prices.length){
            return 0;
        }

        if(dp[idx][bought] != -1){
            return dp[idx][bought];
        }

        int profit = 0;
        if(bought == 0){
            int buy = memoization(idx + 1, prices, 1, dp) - prices[idx];
            int notBuy = memoization(idx + 1, prices, 0, dp);
            profit = Math.max(buy, notBuy);
        }else{
            int sell = memoization(idx + 2, prices, 0, dp) + prices[idx];
            int notSell = memoization(idx + 1, prices, 1, dp);
            profit = Math.max(sell, notSell);
        }

        return dp[idx][bought] = profit;
    }

    private int tabulation(int[] prices){

        int n = prices.length;
        int[][] dp = new int[n+2][2];

        for(int idx = n - 1; idx >= 0; idx--){
            for(int bought = 0; bought <= 1; bought++){
                int profit = 0;
                if(bought == 0){
                    int buy = dp[idx + 1][1] - prices[idx];
                    int notBuy = dp[idx + 1][0];
                    profit = Math.max(buy, notBuy);
                }else{
                    int sell = dp[idx + 2][0] + prices[idx];
                    int notSell = dp[idx + 1][1];
                    profit = Math.max(sell, notSell);
                }
                dp[idx][bought] = profit;
            }
        }

        return dp[0][0];
    }
    
    private int spaceOptimized(int[] prices) {

        int n = prices.length;
        int[] next = new int[2];
        int[] next2 = new int[2];
        int[] curr = new int[2];

        for (int idx = n - 1; idx >= 0; idx--) {
            for (int bought = 0; bought <= 1; bought++) {
                int profit;
                if (bought == 0) {
                    int buy = next[1] - prices[idx];
                    int notBuy = next[0];
                    profit = Math.max(buy, notBuy);
                } else {
                    int sell = next2[0] + prices[idx];
                    int notSell = next[1];
                    profit = Math.max(sell, notSell);
                }
                curr[bought] = profit;
            }
            next2 = next.clone();
            next = curr.clone();
        }

        return curr[0];
    }


    public int maxProfit(int[] prices) {

        // return recursive(0, prices, 0);
        
        // int n = prices.length;
        // int[][] dp = new int[n][2];

        // for(int[] a : dp){
        //     Arrays.fill(a, -1);
        // }

        // return memoization(0, prices, 0, dp);

        // return tabulation(prices);
        return spaceOptimized(prices);
    }
}