class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Tracks where the next non-zero number should go (the "Writer")

        // 'right' scans through the array from start to finish (the "Reader")
        for (int right = 0; right < nums.length; right++) {
            
            // If the Reader finds a number that isn't zero...
            if (nums[right] != 0) {
                
                // --- 3-Step Swap Process ---
                int temp = nums[right];   // 1. Save the non-zero number in a temporary box
                nums[right] = nums[left]; // 2. Put the zero (at left) into the right position
                nums[left] = temp;        // 3. Put the non-zero number into the left position
                
                left++; // Move the Writer forward 1 spot to prepare for the next match
            }
        }        
    }
}