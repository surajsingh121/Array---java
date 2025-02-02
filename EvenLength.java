import java.util.Scanner;
class EvenLength
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size:");
		int size=sc.nextInt();
		sc.nextLine();
		String[] y=new String[size];
		for(int i=0;i<y.length;i++){
			System.out.println("Enter element at index:"+i);
			y[i]=sc.nextLine();
		}
		System.out.println("The Result is Below: ");
		getEvenLengthString(y);
	} 
	public static void getEvenLengthString(String[] y)
	{
		int count=0;
		for(String p:y){
			if(p.length()%2==0){
				System.out.println(p);
				count++;
			}
		}
		System.out.println("Total COunt is: "+count);
	}
}









