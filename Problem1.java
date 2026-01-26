//1. Two Sum

//Hashing Technique

//Traverse the array
//Check if (target - current element) is present
//If present, return the indices of required elements
//Else put the element with it's index in the hash (hashmap)
//Return empty array when no pair exists

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need = target - arr[i];
            if(hash.containsKey(need)){
                return new int[]{hash.get(need),i};
            }
            hash.put(arr[i],i);
        }
        return new int[]{};
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
