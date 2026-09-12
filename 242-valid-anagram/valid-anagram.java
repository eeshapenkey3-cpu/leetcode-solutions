class Solution {
    public boolean isAnagram(String s, String t) {
        //break string into char array
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
    //figure out if they're equal, Arrays.equal() counts position as well
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(tc, sc);
    }
}