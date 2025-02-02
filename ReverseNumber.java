import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args)
	{
		int[] a={17, 16, 101, 127, 141, 377, 437};
		System.out.println("Result is Below: ");
		for(int i=0;i<a.length;i++)
		{
			getReverse(a[i]);
		}
	} 
	public static void getReverse(int n)
	{
		int rev=0;
		while(n>0){
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
	System.out.print(rev+"  ");
	}
}




