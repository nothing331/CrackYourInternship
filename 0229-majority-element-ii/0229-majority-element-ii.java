class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        List<Integer> result = new ArrayList<>();
        int n = nums.length/3;
        for(Map.Entry<Integer,Integer> entery : map.entrySet()){
            int element= entery.getKey();
            int count = entery.getValue();
            if(count>n){
                result.add(element);
            }
        }
        return result;
    }
}