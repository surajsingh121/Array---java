import java.util.Scanner;
class Program8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size:");
		int size=sc.nextInt();
		int[] y=new int[size];
		for(int i=0;i<y.length;i++){
			System.out.println("Enter element at index:"+i);
			y[i]=sc.nextInt();
		}
		System.out.println("SUm and Average are Below: ");
		getSumAndAverage(y);
	} 
	public static void getSumAndAverage(int[] y)
	{
		int sum=0;
		for(int k:y)
			sum=sum+k;
	System.out.println("Sum is: "+sum+" Average is: "+sum/y.length);
	}
}




