// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Best_Time_to_Buy {
    class Solution {
        public int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int max=0;
            int m=0;
            for(int i =0;i<prices.length;i++){
                if(prices[i]<min)
                    min=prices[i];
                m=prices[i]-min;
                if(max<m){
                    max=m;
                }
            }
            return max;
        }
    }
}
