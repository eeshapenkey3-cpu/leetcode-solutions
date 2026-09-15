class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            int count = map.getOrDefault(i,0) + 1;
            map.put(i, count);

            if(count > nums.length / 2){
                return i;
            }
        }//end for loop
        return 0;
    }
}