import java.util.Scanner;
class InsertionSortAscending
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
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	return a;	
	}				
}












