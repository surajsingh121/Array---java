import java.util.Scanner;
class Shift01
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter length: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			System.out.print("ENter element "+(i+1)+": ");
			a[i]=sc.nextInt();
		}
		int[] b=shift(a);
		for(int x:b)
			System.out.print(x+"  ");

	} 
	public static int[] shift(int[] a)
	{
		int[] a2=new int[a.length];
		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
				count1++;
		}
		for(int i=a2.length-1;count1>0;i--)
		{
			a2[i]=1;
			count1--;
		}
	return a2;	
	}
}












