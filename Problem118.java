//118. Pascal's Triangle

//Outer loop for rows 
//Add new Arraylist for each row
//Inner loop to store elements
//If j=0 and j=i, element is 1
//Else, sum of two numbers above it from previous row

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>arr = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            arr.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if (j==0 || j==i) arr.get(i).add(1);
                else{
                    int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).add(val);
                }
            }
        }
        return arr;
        
        
    }
}

//Time complexity: O(n*n)
//Space complexity: O(n*n)
