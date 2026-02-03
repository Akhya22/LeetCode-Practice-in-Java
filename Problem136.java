//136. Single Number

//Hashing approach
//Store array elements with their frequency count in a hashmap
//Traverse the hashmap, if value is 1 then return the respective key

class Solution {
    public int singleNumber(int[] nums) {
      
        HashMap<Integer, Integer> hash = new HashMap<>();
      
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
      
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
      
        return -1;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
