class Solution {
    public int findPeakElement(int[] arr) {
        int left=0;
        int right=arr.length-1;
          int ans=-1;
          if(arr.length==1)
          {
            return 0;
          }
          if(arr[0]>arr[1])
          {
            return 0;
          }
          if(arr[arr.length-1]>arr[arr.length-2])
          {
            return arr.length-1;
          }

         while(left<=right)
        {  
            int mid=left+(right-left)/2;
             if(arr[mid]>arr[mid+1])
         {
              ans =mid;
             right=mid-1;
         }
         else
         {
            
            left=mid+1;
         }
        }
       return ans;
    }
}