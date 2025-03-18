class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set set = new HashSet();
        int length = s.length();
        int start = 0;
        int end = 0;
        int answer = 0;

        while(end < length) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            }
            else {
                set.add(s.charAt(end++));
                answer = Math.max(answer, end - start);
            }
        }

        return answer;
    }
}