import java.util.*;
class acromate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,l;
		String str;
		char ch;
		System.out.println("Enter the String");
		str=sc.nextLine();
		str=" "+str;
		l=str.length();
		for(i=0;i<l;i++)
		{
			ch=str.charAt(i);
			if(ch==' ' )
			{
				System.out.print(str.charAt(i+1));
			}

		}
	}
}