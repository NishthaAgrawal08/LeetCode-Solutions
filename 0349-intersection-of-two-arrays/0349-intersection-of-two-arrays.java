class Solution {
    public int[] intersection(int[] arr, int[] arr1) {
         HashMap<Integer,Integer> map=new HashMap<>();
         HashMap<Integer,Integer> map1=new HashMap<>();
        int r[]=new int[arr.length];
    for(int i=0;i<arr.length;i++)
    {
         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
     for(int i=0;i<arr1.length;i++)
    {
         map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
    }
    int index=0;
    int count=0;
   for(int i : map1.keySet()) 
    {
        if(map.containsKey(i))
        {
            count++;
            r[index]=i;
            index++;
        }
    }      
    int res[]=new int[count];
    for(int i=0;i<r.length;i++)
    {
        if(r[i]!=0)
        {
            res[i]=r[i];
        }
    }
    return res;
    }
}