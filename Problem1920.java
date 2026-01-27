//1920. Build Array from Permutation

//Take an extra array of same size as arr
//For each index i in ans: ans[i]=arr[arr[i]]

class Solution {
    public int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)

//Note: Can be optimized further
