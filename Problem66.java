///66. Plus One

//Traverse from last digit and handle carry
//If digit < 9, add 1 to it and return 
//Else make it 0 as sum becomes 10
//If all digits are 9, then array length increases by 1, first digit = 1 and others 0

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i]<9){          //when digit < 9
                digits[i]++;
                return digits;
            }
            digits[i] = 0;           //when digit = 9, 
        }

        //when all digits can be 9
        int[] arr = new int[digits.length+1];
        arr[0]=1;
        return arr;



    }
}

//Time Complexity: O(n)
//Space Complexity: O(n) in worst case, O(1) in other cases
