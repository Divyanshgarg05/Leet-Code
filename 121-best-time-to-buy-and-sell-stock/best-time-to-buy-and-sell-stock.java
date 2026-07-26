class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i : prices){
            if(min > i){
                min = i;
            }
            int currProfit = i-min;
            profit = Math.max(profit,currProfit);
        }
        return profit;
    }
}