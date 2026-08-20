class Solution {
    public String majorityFrequencyGroup(String s) {
         int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }


        int bestFreq = 0;
        int bestSize = 0;

        for (int freq = 1; freq <= s.length(); freq++) {

            int size = 0;
            for (int i = 0; i < 26; i++) {
                if (arr[i] == freq) {
                    size++;
                }
            }
            if (size > bestSize || 
                (size == bestSize && freq > bestFreq)) {

                bestSize = size;
                bestFreq = freq;
            }
        }
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (arr[i] == bestFreq) {
                ans.append((char)('a' + i));
            }
        }

        return ans.toString();
    }
}