//344. Reverse String

//Two Pointer Approach-
//1. Start with two pointers, i from 0 and j from last 
//2. Swap characters at i and j
//3. Move i forward and j backward until they meet

class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1 ;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

//Time Complexity: O(n)
//Space Complexity:  O(1)
