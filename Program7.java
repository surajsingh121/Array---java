import java.util.Scanner;
class Program7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size:");
		int size=sc.nextInt();
		double[] y=new double[size];
		for(int i=0;i<y.length;i++)
		{
			System.out.println("Enter element at index:"+i);
			y[i]=sc.nextDouble();
		}
		System.out.println("All the elements entered are Below: ");
		getElements(y);
	} 
	public static void getElements(double[] p)
	{
		for(double k:p)
			System.out.print(k+" ");
	}
}