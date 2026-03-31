//125. Valid Palindrome

//Approach -
//1. Remove all non alphanumeric characters and convert to lowercase characters
//2. Initialize two pointers
//3. Compare the characters at i and j until they meet
//4. Return false if not equal, else return true

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0, j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
