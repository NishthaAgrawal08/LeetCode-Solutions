class Solution {
    public int maxVowels(String s, int k) {
         int left=0;
         int right=0;
         int count=0;
         int maxi=Integer.MIN_VALUE;
         while(right<s.length())
         {
            char ch=s.charAt(right);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
            if(right-left+1<k)
            {
                right++;
            }
            else if(right-left+1==k)
            {
                maxi=Math.max(maxi,count);
                char leftchar=s.charAt(left);
                if(leftchar=='a' || leftchar=='e' || leftchar=='i' || leftchar=='o' || leftchar=='u' )
                {
                    count--;
                }
                left++;
                right++;
            }
         }
         return maxi;
    }
}