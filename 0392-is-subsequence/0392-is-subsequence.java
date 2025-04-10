class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) {
            return true;
        }

        int num = 0;
        for(int i=0;i<t.length();i++) {
            if(t.charAt(i) == s.charAt(num)) {
                num++;

                if(num == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}