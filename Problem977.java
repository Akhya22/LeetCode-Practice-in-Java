//977.Squares of a Sorted Array

//Sqaure the elements and store in their respective positions while looping
//Sort the array and return


class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

//Time Complexity: O(n*logn)
//Space Complexity: O(1)     (ignoring internal sort stack space)

//Note: Can be optimized further
