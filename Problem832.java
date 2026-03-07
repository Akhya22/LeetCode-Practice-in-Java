//832. Flipping an Image

class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {

        //Horizontally flip the row elements (reverse the row elements)
        for(int i=0;i<arr.length;i++){
            int p =0;
            int q = arr[i].length - 1;
            while(p<q){
                int temp = arr[i][p];
                arr[i][p]=arr[i][q];
                arr[i][q]=temp;
                p++;
                q--;
            }
            //Replace 0 by 1 and 1 by 0
            for(int j=0;j<arr[0].length;j++){
                  arr[i][j]^=1;
            }
        return arr;
    }
}

//Time Complexity: O(n*n)
//Space Complexity: O(1)
