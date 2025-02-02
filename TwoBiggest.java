import java.util.Scanner;
class TwoBiggest
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
		getTwoBiggest(a);
	} 
	public static void getTwoBiggest(int[] a)
	{
		int h1=a[0];
		int h2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>h1){
				h2=h1;
				h1=a[i];
			}
			else if(a[i]>h2 && a[i]!=h1){
				h2=a[i];
			}
		}
	System.out.println("Biggest is: "+h1);
	if(h2==Integer.MIN_VALUE)
		System.out.println("2nd Biggest doesn't EXIST!!");
	else
		System.out.println("2nd Biggest is: "+h2);

	}
}












