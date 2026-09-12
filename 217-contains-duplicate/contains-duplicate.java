class Solution {
    public boolean containsDuplicate(int[] nums) {
        //create empty set
        HashSet<Integer> seen = new HashSet<>();
        //loop through
        for(int num : nums){
            //find duplicates
            if(!seen.add(num)){
                return true;
            }
        }
        return false;

    }
}