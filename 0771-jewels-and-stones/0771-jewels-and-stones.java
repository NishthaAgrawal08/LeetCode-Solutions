class Solution {
    public int numJewelsInStones(String t, String s) {
        int[] arr = new int[256];
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
           arr[ch]+=1;
            }
       int count=0;
       for(int i=0; i<s.length();i++)
       {
        char ch = s.charAt(i);
        if(arr[ch]>0)
        {
            count++;
        }
       }
         return count;  
        
    }
}