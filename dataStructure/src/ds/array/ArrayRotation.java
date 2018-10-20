package ds.array;

public class ArrayRotation {

	public static void main(String[] args)
	{
		ArrayRotation ar= new ArrayRotation();
		int[] arr= {0,5,3,4,2,6,7};
		int d= 2;
		ar.rotateArray(arr,d);
		ar.printArray(arr);
	}
	
	public void rotateArray(int[] arr, int d)
	{
		for(int i=0;i<d;i++)
		{
			rotateOneByOne(arr);
		}
	}
	
	private void rotateOneByOne(int[] arr) {
		int i=0;
		int temp= arr[0];
		for(i= 0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		
	}

	public void printArray(int[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
