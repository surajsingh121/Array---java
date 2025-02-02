import java.util.Scanner;
class SelectionSortAscending
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
		sort(a);
		System.out.println("Sorted Elements are: ");
		for(int x:a)
			System.out.print(x+"  ");

	} 
	public static int[] sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{	
			int min=a[i];		int min_index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<min){
					min=a[j];
					min_index=j;
				}
			}
			a[min_index]=a[i];
			a[i]=min;
	return a;	
	}				
}












