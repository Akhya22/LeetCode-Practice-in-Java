//48. Rotate Image


class Solution {
    public void rotate(int[][] arr) {
        //Transpose the matrix  (change in matrix)
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //Reverse the rows of the matrix
        for(int i=0;i<arr.length;i++){
            int p =0;
            int q = arr[0].length-1;
            while(p<q){
                int temp = arr[i][p];
                arr[i][p] = arr[i][q];
                arr[i][q] = temp;
                p++;
                q--;
            }
        }
    }
}

//Time Complexity: O(n*n)
//Space Complexity: O(1)
