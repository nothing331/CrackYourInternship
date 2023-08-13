public class Find_the_Duplicate Number {
    // link: https://leetcode.com/problems/find-the-duplicate-number/
    //here we have used hash set toto keep track of all unique elemets and the moment we get any repeate it goes falue and increment 

    class Solution {
        public int findDuplicate(int[] nums) {
            HashSet<Integer> map = new HashSet<>();
            for(int num:nums){
                if(!map.add(num))
                    return num;
            }
            return -1;
        }
    }
}
