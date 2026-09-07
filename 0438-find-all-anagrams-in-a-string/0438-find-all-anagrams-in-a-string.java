class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res=new ArrayList<>();
        int l=0;
        int k=p.length();
        int arr[]=new int [26];
        int arr1[]=new int[26];
        for(char ch: p.toCharArray())
        {
            arr[ch-'a']++;
        }
        for(int r=0;r<s.length();r++)
        {
            char chr=s.charAt(r);
            arr1[chr-'a']++;
            if(r-l+1==k)
            {
               if(Arrays.equals(arr,arr1))
               {
                  res.add(l);
               }
               char chl=s.charAt(l);
               arr1[chl-'a']--;
                l++;
            }
        }
        return res;
    }
}