import java.util.*;
class ArraySum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int digit,sum=0;
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("Enter the Number:");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			sum=sum+ arr[i]*arr[i];
		}
		System.out.println(sum);

	}
}



