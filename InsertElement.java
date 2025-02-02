import java.util.Scanner;
class InsertElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a={17, 16, 101, 127, 141, 377, 437};
		System.out.println("ENter index: ");
		int index=sc.nextInt();
		System.out.println("ENter value: ");
		int value=sc.nextInt();
		int[] x=insertElement(a, index, value);
		System.out.println("Original Array is: ");
		for(int l:a)
			System.out.print(l+" ");
		System.out.println("\nModified Array is: ");
		for(int j:x)
			System.out.print(j+" ");
	} 
	public static int[] insertElement(int[] k, int index, int value)
	{
		int[] p=new int[k.length+1];
		p[index]=value;
		for(int i=0;i<k.length;i++)
		{
			if(i<index)
				p[i]=k[i];
			else
				p[i+1]=k[i];
		}
	return p;
	}
}












