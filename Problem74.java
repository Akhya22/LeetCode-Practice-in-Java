//74. Search a 2D Matrix

//Approach -
//1. Start from the top right corner element
//2. If target < element, j--;
//   If target > element i++;
//   If target == element, return true;


class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int i = 0;
        int j = arr[0].length-1;
        while(j>=0 && i<arr.length){
            if(arr[i][j]<target) i++;
            else if(arr[i][j]>target) j--;
            else return true;
        }
        return false;
    }
}

//Time Complexity: O(m+n)
//Space Complexity: O(1)
