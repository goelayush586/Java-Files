import java.util.*;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		int total=0;
		double avg;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Marks:");
			arr[i]=sc.nextInt();
			total=total+arr[i];
		}
		avg=total/5.0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("total marks:"+total);
		System.out.println("Average marks:"+avg);
	}
}
