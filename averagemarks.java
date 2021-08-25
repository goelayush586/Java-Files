import java.util.*;
class averagemarks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m1,m2,m3,min=0;
		double avg,sum;
		System.out.println("Enter marks of subject 1:");
		m1=sc.nextInt();
		System.out.println("Enter marks of subject 2:");
		m2=sc.nextInt();
		System.out.println("Enter marks of subject 3:");
		m3=sc.nextInt();
		if(m1<=m2 && m1<=m3)
		{
			min =m1;
		}
		if(m2<=m3 && m2<=m1)
		{
			min=m2;
		}
		if(m3<=m2 && m3<=m1)
		{
			min=m3;
		}

		sum = (m1+m2+m3)-min;
		avg=sum/2.0;
		System.out.println("Average of best two is:"+avg);
	}
}
