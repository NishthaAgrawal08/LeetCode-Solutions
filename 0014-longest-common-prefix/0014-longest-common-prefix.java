class Solution {
    public String longestCommonPrefix(String[] arr) {
      StringBuilder sum=new StringBuilder("");
		int min=Integer.MAX_VALUE;
		int minindex=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()<min)
			{
				min=arr[i].length();
				minindex=i;
			}
		}	
			String str=arr[minindex];
			for(int j=0;j<str.length();j++)
			{
				char ch =str.charAt(j);
				int count=0;
				for(int k=0;k<arr.length;k++)
				{
					if(arr[k].charAt(j)==ch)
					{
						count++;
					}
                   
				}
				if(count==arr.length)
				{
					sum.append(ch);
				}
                 else
                    {
                        break;
                    }
			}
                    return sum.toString();
	
		
    }
}