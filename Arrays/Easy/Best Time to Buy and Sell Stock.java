class Solution {
    public int maxProfit(int[] prices) {
        int j = prices[0],c = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < j)
            j = prices[i];
            else if(prices[i] - j > c)
            c = prices[i] - j;
        }
        return c;
    }
}
