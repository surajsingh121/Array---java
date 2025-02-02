import java.util.Scanner;
class Duplicates
{
	public static void main(String[] args)
	{
		int[] a={17, 17, 16, 18, 35, 20, 17, 16, 20, 18, 17, 17, 20, 22};
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
			if(count>1)
				System.out.print(k[i]+" ");
		}		
	}
}












