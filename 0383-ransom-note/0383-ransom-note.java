class Solution {
    public boolean canConstruct(String ransomnote, String magazine) 
    {
        int arr[]=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<ransomnote.length();i++)
        {
            char ch=ransomnote.charAt(i);
            arr[ch-'a']--;
            if(arr[ch-'a'] < 0)
            {
                return false;
            }
        }
        return true;
    }
}