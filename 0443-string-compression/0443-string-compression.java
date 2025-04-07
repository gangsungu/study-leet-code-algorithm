class Solution {
    public int compress(char[] chars) {
        int length = chars.length;
        StringBuilder sb = new StringBuilder();

        int num = 1;
        for(int i=0;i<length;i++) {
            char c = chars[i];

            while(i<length-1&&chars[i]==chars[i+1]) {
                num++;
                i++;
            }

            sb.append(c);

            if(num > 1) {
                sb.append(num);
            }

            num = 1;
        }

        String compressedStr = sb.toString();
        char[] compressedChars = compressedStr.toCharArray();
        
        for (int i=0;i<compressedChars.length;i++) {
            chars[i] = compressedChars[i];
        }
        
        return compressedChars.length;
    }
}