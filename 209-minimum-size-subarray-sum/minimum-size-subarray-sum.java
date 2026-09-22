class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE; //what does this do
        int left = 0;
        int currentSum = 0;

        for(int right = 0; right < nums.length; right++){
            currentSum += nums[right];

        while(currentSum >= target){
            if(right - left + 1 < minLen){
                minLen = right - left + 1;
            }
            currentSum -= nums[left];
            left++;
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}