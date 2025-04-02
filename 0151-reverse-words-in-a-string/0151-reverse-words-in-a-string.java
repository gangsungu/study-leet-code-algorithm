class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder returnWord = new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--) {
            returnWord.append(words[i]).append(i>0 ? " " : "");
        }

        return returnWord.toString();
    }
}