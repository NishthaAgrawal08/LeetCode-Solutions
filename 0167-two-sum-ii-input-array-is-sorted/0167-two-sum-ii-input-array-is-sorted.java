class Solution {
    public int[] twoSum(int[] arr, int target) {
        int newarr[]=new int[2];
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if((arr[left]+arr[right]) == target)
            {
                newarr[0]=left+1;
                newarr[1]=right+1;
                break;
            }
            else if((arr[left]+arr[right]) < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }  
        return newarr;
    }
}