import java.util.Scanner;
class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a={17, 17, 16, 18, 35, 20, 17, 16, 20, 18, 17, 17, 20, 22};
		System.out.println("Enter the element to search: ");
		int target=sc.nextInt();
		int index=searchElement(a,target);
		if(index>=0)
			System.out.println("Element is found at index: "+index);
		else
			System.out.println("Element is Not FOUND");	
	} 
	public static int searchElement(int[] a, int target)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
				return i;
		}
	return -1;		
	}
}












