//238.Product of Array Except Self

//Store prefix products in an array
//Store suffix products in other array
//Multiply suffix and prefix products to get result

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Prefix products calculation
        int[] prefix = new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        
        //Suffix products calculation
        int[] suffix = new int[nums.length];
        suffix[suffix.length-1]=1;
        for(int i=suffix.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        //Product of Arrays
        for(int i=0;i<nums.length;i++){
            prefix[i]=prefix[i]*suffix[i];
        }

        //Return ans
        return prefix;
        
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
