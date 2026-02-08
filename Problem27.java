//27. Remove Element

//Two Pointer Appraoch
//Use two pointers: i from start, j from end
//If nums[i]!=val then i++
//Else check if nums[j]==val, then j-- else swap nums[i] and nums[j]

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i]!=val) i++;
            else{
                if(nums[j]==val) j--;
                else{
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j--;
                }
                
            }

        }
        return i;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)

