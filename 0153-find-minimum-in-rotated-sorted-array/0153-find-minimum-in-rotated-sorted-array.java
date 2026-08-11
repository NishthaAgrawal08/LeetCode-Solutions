class Solution {
    public int findMin(int[] arr) {
         int last=arr[arr.length-1];
        int left=0;
        int right=arr.length-1;
        int ans=0;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
             if(arr[mid]<=last)
         {
               ans=mid;
             right=mid-1;
         }
         else
         {
            
            left=mid+1;
         }
        }
       
           return arr[ans];
    }
}