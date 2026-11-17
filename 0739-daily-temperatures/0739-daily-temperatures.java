class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int [] nge=new int [n];
         Stack<Integer> s=new Stack<>();
         for(int i=0;i<n;i++)
         {
            while(!s.isEmpty() && arr[s.peek()]<arr[i])
            {
                int prevIndex=s.pop();
                nge[prevIndex]=i-prevIndex;
            }
            s.push(i);
         }
         return nge;
    }
}