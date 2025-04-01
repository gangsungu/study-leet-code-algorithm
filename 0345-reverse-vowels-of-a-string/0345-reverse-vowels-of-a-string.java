class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;

        String vowels = "aeiouAEIOU";
        String[] words = s.split("");

        while(start < end) {
            while (start < end && vowels.indexOf(words[start]) == -1) {
                start++;
            }

            while(start < end && vowels.indexOf(words[end]) == -1) {
                end--;
            }

            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }

        return String.join("", words);
    }
}