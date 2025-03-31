class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;

        for(int i=0;i<size && n>0;i++) {
            boolean prev = i == 0 || flowerbed[i-1] == 0;
            boolean fut = i == size - 1 || flowerbed[i + 1] == 0;
            if (prev && fut && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n <= 0;
    }
}