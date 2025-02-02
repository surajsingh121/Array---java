import java.util.Scanner;
class Shift01and2
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
		int count0=0;		int count1=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0)	count0++;
			else if(a[i]==1)	count1++;
		}
		int[] b=new int[a.length];
		for(int i=count0;i<b.length;i++){
			if(i<count0+count1)	b[i]=1;
			else			b[i]=2;
		}		
        return b;
	}
}












