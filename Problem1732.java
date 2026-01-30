//1732. Find the Highest Altitude

//No need of extra array since maximum altitude is required
//Decalring a variable to 0 to store running sum
//Trip starts with altitude 0, and each next altitude depends on previous one
//Traversing the gain array, update the sum and track maximum altitude
//Return maximum altitude


class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int pt=0;
        for(int i=0;i<gain.length;i++){
            pt+=gain[i];
            alt=Math.max(pt,alt);
            
        }
        return alt;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
