class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int result = 0;
        int i = 0;
        int j = nums.length - 1;

        while(i < j) {
            int temp = nums[i] + nums[j];

            if(temp == k) {
                i++;
                j--;
                result++;
            }
            else if(temp > k) {
                j--;
            }
            else {
                i++;
            }
        }

        return result;
    }
}