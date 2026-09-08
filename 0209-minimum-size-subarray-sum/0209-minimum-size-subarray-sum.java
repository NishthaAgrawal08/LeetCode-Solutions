class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0;
        int min=nums.length+1;

        for(int r=0;r<nums.length;r++)
        {
            // expansion
            sum += nums[r];
            while(sum>=target)
            {
               min=Math.min(min,r-l+1);
               sum-=nums[l];
               l++;
            }
           
        }
        return (min==nums.length+1? 0:min);
    }
}