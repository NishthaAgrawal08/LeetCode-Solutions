class Solution {
    public char findTheDifference(String s, String t) 
    {
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            arr[ch]++;
        }    
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            arr[ch]--;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                
                return (char)i;
            }
        }
        return 0;
    }
}