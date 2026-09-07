class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr[]=new int[26];
        int arr1[]=new int [26];
        int l=0;
        int k=s1.length();
        for(char ch: s1.toCharArray())
        {
            arr[ch-'a']++;
        }
        for(int r=0;r<s2.length();r++)
        {
          char chr=s2.charAt(r);
          arr1[chr-'a']++;


            if(r-l+1==k)
            {
                if(Arrays.equals(arr,arr1))
                {
                    return true;
                }
                char chl=s2.charAt(l);
                arr1[chl-'a']--;

                l++;
            }
        }
        return false;
    }
}