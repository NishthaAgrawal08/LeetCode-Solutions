class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int pse[]=new int[n];
        int nse[]=new int [n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                pse[i]=-1;
            }
            else
            {
                pse[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nse[i]=n;
            }
            else
            {
                nse[i]=s.peek();
            }
            s.push(i);
        }
        int maxarea=0;
        for(int i=0;i<n;i++)
        {
            int width=nse[i]-pse[i]-1;
            int area=width*heights[i];
             maxarea=Math.max(area,maxarea);
        }
        
           return maxarea;
    }
}