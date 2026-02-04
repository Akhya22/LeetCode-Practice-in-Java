//121.Best Time to Buy and Sell Stock

//Loop through the array
//Track minimum price and maximum price dynamically
//Update profit as minPrice and currProfit found


class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if (prices[i]<minPrice)  minPrice = prices[i];
            int currProfit = prices[i] - minPrice;
            profit = Math.max(currProfit,profit);
        }
        return profit;

    }
}

//TIme Complexity: O(n)
//Space Complexity: O(1)
