//867. Transpose Matrix

//Matrix may not be a square -> order(m x n)
//New matrix required to store transposed result
//From the original matrix ssign arr[j][i] to brr[i][j] by traversing new matrix through indices

class Solution {
    public int[][] transpose(int[][] arr) {

        int[][] brr = new int[arr[0].length][arr.length];
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[0].length;j++){
                brr[i][j]=arr[j][i];
            }
        }
        return brr;   
    }
}

//Time complexity: O(m*n)
//Space complexity: O(m*n)
