//59. Spiral Matrix II


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int fr = 0;
        int fc = 0;
        int lr = n-1;
        int lc = n-1;

        int val = 1;

        while(fr<=lr && fc<=lc){
            //fr constant
            for(int j=fc; j<=lc;j++){
                arr[fr][j]=val;
                val++;
            }
            fr++;
            //lc constant
            for(int i=fr;i<=lr;i++){
                arr[i][lc]=val;
                val++;
            }
            lc--;
            //lr constant
            for(int j=lc;j>=fc;j--){
                arr[lr][j]=val;
                val++;
            }
            lr--;
            //fc constant
            for(int i=lr;i>=fr;i--){
                arr[i][fc]=val;
                val++;
            }
            fc++;

        }
    
        return arr;
    }
}


//Time Complexity: O(n*n)
//Space Complexity: O(n*n)
