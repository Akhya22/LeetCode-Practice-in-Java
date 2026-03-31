//796. Rotate String

//Approach - 
//1. Return false if lengths of both strings are not equal
//2. Concatenate the string s with itself
//3. Check if the goal string is a substring of the concatenated string

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String temp = s + s;
        return temp.contains(goal);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
