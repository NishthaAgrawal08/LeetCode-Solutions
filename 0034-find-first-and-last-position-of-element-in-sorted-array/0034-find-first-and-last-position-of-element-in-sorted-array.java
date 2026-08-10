class Solution {
     public static int first(int arr[],int target)
    {
        int ans=-1;
         int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
             if(arr[mid]==target)
         {
               ans=mid;
               right=mid-1;
            //    left=mid+1 for last occurance
         }
         else if(arr[mid]<target)
         {
            left=mid+1;
         }
         else
         {
            right=mid-1;
         }
        }
       return ans;
    }
      public static int last(int arr[],int target)
    {
        int ans=-1;
         int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
             if(arr[mid]==target)
         {
               ans=mid;
            //    right=mid-1;
             left=mid+1;
            //    for last occurance
         }
         else if(arr[mid]<target)
         {
            left=mid+1;
         }
         else
         {
            right=mid-1;
         }
        }
       return ans;
    }

    public int[] searchRange(int[] arr, int target) {
        int str[]=new int[2];
 str[0]=first(arr, target);
str[1]=last(arr, target); 
return str;
    
}
}