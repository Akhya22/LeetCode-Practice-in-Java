//1929. Concatenation of Array

//Create a new array of size 2*nums.length, copy the elements from nums to the first half of new array
//Loop through nums and fill second half elements of new array
//arr[i+nums.length] = nums[i]

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = Arrays.copyOf(nums,2*n);
        for(int i=0;i<n;i++){
                arr[i+n]=nums[i];
        }
        return arr;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
