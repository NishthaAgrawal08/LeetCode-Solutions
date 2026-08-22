class Solution {
    public int trap(int[] height) 
    {
        int len=height.length;
        //Left max Boundary
        int leftmax[]=new int[len];
        leftmax[0]=height[0];
        for(int i=1;i<len;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        //Right max Boundary
        int rightmax[]=new int[len];
        rightmax[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater=0;
        for(int i=0;i<len;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
}