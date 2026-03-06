//349. Intersection of Two Arrays


//1. Put all elements of nums1 in a hashset
//2. Traverse nums2 and check if hashset contains nums2 array elements
//3. Add it to an arraylist and remove that element from hashset
//4. Create an array and put all arraylist elements to it and return the array


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> temp = new HashSet<>();


        for(int i=0;i<m;i++){
            temp.add(nums1[i]);
        }

        for(int i=0;i<n;i++){
            if(temp.contains(nums2[i])){
                al.add(nums2[i]);
                temp.remove(nums2[i]);
            }
        }

        int[] inter = new int[al.size()];
        for(int k=0;k<al.size();k++){
            inter[k] = al.get(k);
        }
        return inter;
    }
}


//Time Complexity: O(m+n)
//Space Complexity: O(m)
