import java.util.Scanner;
class Frequency
{
	public static void main(String[] args)
	{
		int[] a={17, 17, 16, 18, 20, 17, 16, 20, 18, 17, 17, 20, 22};
		getFrequency(a);		
	} 
	public static void getFrequency(int[] k)
	{
		int n=k.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(k[i]==k[j])
				{
					count++;
					k[j]=k[n-1];
					n--;	j--;
				}
			}
			System.out.println(k[i]+" is===> "+count+" times");
		}		
	}
}












