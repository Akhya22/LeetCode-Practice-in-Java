//1572. Matrix Diagonal Sum


class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
      //Using row index to calculate diagonal sums
        for(int i=0;i<n;i++){
          //Sum of Primary diagonal elements 
            sum+=mat[i][i];
          //Sum of Secondary diagonal elements 
            sum+=mat[i][n-1-i];
        }
      // If matrix size is odd, subtract the middle element (counted twice)
        if(n%2!=0){
            sum-=mat[n/2][n/2];  
        }
        return sum;

    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
