import java.util.Scanner;
class Program6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double[] y=new double[8];
		System.out.println("Enter element at index0: ");
		y[0]=sc.nextDouble();
		System.out.println("Enter element at index1: ");
		y[1]=sc.nextDouble();

		getElements(y);

	} 
	public static void getElements(double[] p)
	{
		for(double k:p)
			System.out.println(k);	

	}
}