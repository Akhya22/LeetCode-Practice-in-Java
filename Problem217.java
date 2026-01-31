//217. Contains Duplicate

//Use hashmap to store elements of array with frequencies
//Traverse nums,check while increasing frequency count, if it exceeds 1 return true 
//At the end, return false 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>hash = new HashMap<>();
        for(int i:nums){
            hash.put(i, hash.getOrDefault(i,0)+1);
            if(hash.get(i)>1){
                return true;

            }
        }
        return false;        
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
