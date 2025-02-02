import java.util.Scanner;
class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a={17, 17, 23, 30, 45, 52, 55, 60, 64, 70, 71, 75};
		System.out.println("Enter the element to search: ");
		int target=sc.nextInt();
		int index=searchElement(a, 0, a.length-1, target);
		if(index>=0)
			System.out.println("Element is found at index: "+index);
		else
			System.out.println("Element is Not FOUND");	
	} 
	public static int searchElement(int[] a, int low, int high, int target)
	{
		int mid=(low+high)/2;
		if(a[mid]==target)
			return mid;
		else if(low>high)
			return -1;
		else if(a[mid]>target)
			return searchElement(a, low, mid-1, target);
		else 
			return searchElement(a, mid+1, high, target);		
	}
}












