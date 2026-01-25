//1480. Running Sum of 1D Array

//Take another array to store running sum
//Initialize first element
//Run the loop, add previous sum to the current element
//brr[i]=brr[i-1]+arr[i]

class Solution {
    public int[] runningSum(int[] arr) {
        int[] brr = new int[arr.length];
        brr[0]=arr[0];
        for(int i=1;i<brr.length;i++){
            brr[i]=brr[i-1]+arr[i];
        }
        return brr;
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
