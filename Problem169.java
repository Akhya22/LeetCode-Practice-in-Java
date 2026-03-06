//169. Majority Element

//Moore's Voting Algorithm

//1. Initialize two variables - major to store candidate element and votes to store element count
//2. Traverse the array, if votes == 0, set major = current element and set votes = 1
//3. If current element equals major then increase votes by 1
//4. Else votes--
//5. Then, return major

class Solution {
    public int majorityElement(int[] nums) {
        int major = 0;
        int votes = 0;

        for(int i = 0;i<nums.length;i++){
            if(votes==0){
                votes=1;
                major = nums[i];
            }
            else if(nums[i]==major) votes++;
            else votes--;
        }
      return major;

    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
