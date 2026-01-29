//1672. Richest Customer Wealth

//Initialize a variable  to store max wealth
//Initialize sum variable to store sum of each row
//Traverse through the customer account, then store max wealth row wise by comparing with the previous wealth
//Return wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            wealth = Math.max(sum,wealth);
        }
        return wealth;
    }
}

//Time Complexity: O(m*n)
//Space Complexity: O(1)
