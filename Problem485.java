//485. Max Consecutive Ones

//Initialize a variable for storing 1's count (count), and other variable for storing max of 1's count (maxCount)
//Loop through the array 
//If hit 1, increase count and update maxCount, else count=0
//Return maxCount

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){          
            if(nums[i]==1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else{
                count=0;
            }
        }
        return maxCount;  
    }
}

//Time ComplexitY: O(n)
//Space Complexity: O(1)
