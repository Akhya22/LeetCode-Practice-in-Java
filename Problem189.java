//189. Rotate Array

//Two pointer approach
class Solution {
  //function for reversing elements
    void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;

    }
}
    public void rotate(int[] nums, int k) {
      //if array length is 1 then return
        if(nums.length==1) return;

      //Normalize k so that array indices don't go out of bound
        k=k%nums.length;
        if(k==0) return;
      //using pointers
        int start = 0;
        int end = nums.length-1;    
      //Reverse the whole array 
        reverse(nums,start,end);
      //Reverse upto first k terms
        reverse(nums,start,k-1);
      //Reverse the remaining part
        reverse(nums,k,end);

}
}


//Time Complexity: O(n)
//Space Complexity: O(1)
