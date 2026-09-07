class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<fruits.length;r++)
        {
            int key=fruits[r];
            map.put(key,map.getOrDefault(key,0)+1);
            while(map.size()>2)
            {
                int keyl=fruits[l];
                 map.put(keyl,map.get(keyl)-1);
                 if(map.get(keyl)==0)
                 {
                    map.remove(keyl);
                 }

                l++;
            }
            max=Math.max(max,r-l+1);
            
        }
        return max;

    }
}