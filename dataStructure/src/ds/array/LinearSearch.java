package ds.array;

public class LinearSearch {
	
	public static void main(String[] args)
	{
		int[] a={2,3,1,4,27,29,8,0};
		int find=2;
		int search= getElement(a,find);
		System.out.println(search);
	}
	
	public static int getElement(int[] a,int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			{
				return 1;
			}
		}
		
		return -1;
	}

}
