class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums2.length;i++){
            map.put(nums2[i],-1);
        }
        for(int i =0;i<nums2.length;i++){
            for(int j =i;j<nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    map.put(nums2[i],nums2[j]);
                    break;
                }
            }
        }
        for(int i =0;i<nums1.length;i++){
            ans.add(map.get(nums1[i]));
        }
        int[] res = ans.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}