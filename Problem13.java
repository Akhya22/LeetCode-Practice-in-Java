//13. Roman to Integer

//Approach-
//1. Create a hashmap to store characters and their values
//2. Loop through the string upto second last character
//3. Compare current and next character's value
//4. If current < next, then subtract current from result
//5. If current >= next, then add current to result
//6. Always add last character's value from the string in the result

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        for(int i = 0;i<s.length()-1;i++){
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));
            if(current<next) result-=current;
            else result+=current;
            
        }

        result+=map.get(s.charAt(s.length()-1));
        return result;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)    (Hashmap has 7 fixed entries only)
