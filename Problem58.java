//58. Length of Last Word

//Approach - 
//1. Initialize a pointer from the last character
//2. Skip all trailing spaces
//3. Increment the count until space or beginning of string is reached 
//4. Return the count

class Solution {
    public int lengthOfLastWord(String s) {
        
        int j = s.length() - 1;
        int count = 0;
        while( j>=0 && s.charAt(j)==' ') j--;
        while( j>=0 && s.charAt(j)!=' '){
            count++;
            j--;
        }
        return count;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
