import java.util.Scanner;
class DeleteElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a={17, 16, 101, 127, 141, 377, 437};
		System.out.println("ENter index to remove: ");
		int index=sc.nextInt();
		int[] x=removeElement(a, index);
		System.out.println("Original Array is: ");
		for(int l:a)
			System.out.print(l+" ");
		System.out.println("\nModified Array is: ");
		for(int j:x)
			System.out.print(j+" ");
	} 
	public static int[] removeElement(int[] k, int index)
	{
		int[] p=new int[k.length-1];
		for(int i=0;i<k.length;i++)
		{
			if(i<index)
				p[i]=k[i];
			else if(i>index)
				p[i-1]=k[i];
		}
	return p;
	}
}












