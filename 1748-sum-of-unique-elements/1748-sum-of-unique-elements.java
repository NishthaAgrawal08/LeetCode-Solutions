class Solution {
    public int sumOfUnique(int[] arr) {
         HashMap<Integer,Integer> map=new HashMap<>();
         int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            }
            for(int i:map.keySet())
            {
              if(map.get(i)<=1)
              {
                sum+=i;
              }
            }
            return sum;
    }
}