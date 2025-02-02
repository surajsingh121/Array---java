import java.util.Scanner;
class PrimeCount
{
	public static void main(String[] args)
	{
		int[] a={17, 16, 101, 127, 141, 377, 437};
		System.out.println("Result is Below: ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(checkPrime(a[i])){
				System.out.print(a[i]+"  ");
				count++;
			}
		}
		System.out.println("\nTotal Count is: "+count);
	} 
	public static boolean checkPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
	return true;
	}
}




