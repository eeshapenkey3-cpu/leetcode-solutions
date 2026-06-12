class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(int i = 0; i < sentences.length; i++){
            String[] words = sentences[i].split(" "); // stores the split words into the array
            int currentLength = words.length;//length of the words array
            maxWords = Math.max(maxWords, currentLength);
        }
        return maxWords;
    }
}