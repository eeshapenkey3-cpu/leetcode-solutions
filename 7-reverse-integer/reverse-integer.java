class Solution {
    public int reverse(int x) {
        //reversed
        long rev = 0;
        int rem; // remainder

        while(x != 0){
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
        }
        
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
        // if(x > 4294967296L){
        //     return 0;
        // }
    }
}