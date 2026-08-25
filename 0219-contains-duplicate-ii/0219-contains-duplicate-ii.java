class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int first=map.get(nums[i]);
                int dif=(int)Math.abs(first-i);
                if(dif<=k)
                {
                    return true;
                }
                else
                {
                    map.put(nums[i],i);
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}