//54. Spiral Matrix

//Approach-
//1. Initialize four pointers for elements at first row (fr), first column (fc), last row(lr) and last column(lc)
//2. Move in the sequence as per the ques keeping one component constant either row or column
//3. Traverse every element and then check for steps from ( column++, column--, row++, row--)
//4. Also check for number's count so that each element occurs only once, there's no repetition after reaching the end


class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> spiral = new ArrayList<>();

        int fr = 0;
        int fc = 0;
        int lr = arr.length-1;
        int lc = arr[0].length-1;
        int count = arr.length * arr[0].length;

        while(fr<=lr && fc<=lc){
            //fr constatnt
            for(int j=fc;j<=lc;j++) spiral.add(arr[fr][j]);
            fr++;
            if(spiral.size()==count) break;
            //lc constatnt
            for(int i = fr;i<=lr;i++) spiral.add(arr[i][lc]);
            lc--;
            if(spiral.size()==count) break;
            //lr constant
            for(int j = lc; j>=fc;j--) spiral.add(arr[lr][j]);
            lr--;
            if(spiral.size()==count) break;
            //fc constant
            for(int i=lr;i>=fr;i--) spiral.add(arr[i][fc]);
            fc++;
            if(spiral.size()==count) break;
        }

        return spiral;
    }
}


//Time Complexity: O(m*n)
//Space Complexity: O(m*n)
