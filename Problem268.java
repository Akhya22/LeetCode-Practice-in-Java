//268. Missing Number

//Get array length n
//Calculate sum of all array elements
//Calculate sum of n elements => n*(n+1)/2
//Missing number = Sum of n elements - Sum of array elements

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int summation=n*(n+1)/2;
        int missingNum = summation - total;
        return missingNum;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
