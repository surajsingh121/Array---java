import java.util.Scanner;
class RemoveDuplicates
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size;
		do{
		System.out.println("ENter the Size: ");
		size=sc.nextInt();
		if(size>0){
			int[] a=new int[size];
			for(int i=0;i<size;i++){
				System.out.print("ENter the "+(i+1)+" ELement: ");
				a[i]=sc.nextInt();
			}
			int[] p=getUnique(a);
			System.out.println("All Unique Elements are:");
			for(int i=0;i<p.length;i++)
				System.out.print(p[i]+"  ");
		}
		else
			System.out.println("This is Invalid Size");
	}while(size<=0);			
	} 
	public static int[] getUnique(int[] k)
	{
		int n=k.length;
		for(int i=0;i<n;i++){
			int count=1;
			for(int j=i+1;j<n;j++){
				if(k[i]==k[j]){
					count++;
					k[j]=k[n-1];
					n--;	j--;
				}
			}
		}
		int[] b=new int[n];
		for(int i=0;i<n;i++)
			b[i]=k[i];
	return b;
	}
}












