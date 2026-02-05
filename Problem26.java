//26. Remove Duplicates from Sorted Array

//Two Pointer Approach
//Initialize two pointers i and j at index 0
//Iterate through the array with index j
//If the next element does not equal the current element, place it at index i + 1 and increase i by 1
//Return i+1 at the end

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]!=nums[j+1]){
                nums[i+1]=nums[j+1];
                i++;

            }
        }
        return i+1;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
