import java.util.*;
class acromatic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,l,pos;
		String str;
		char ch;
		System.out.println("Enter the string:");
		str=sc.nextLine();
		str=""+str;
		l=str.length();

		System.out.print(str.charAt(0));
		pos=str.lastIndexOf(' ');
		for(i=0;i<pos;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				System.out.print(str.charAt(i+1) + ".");

			}

		}
		System.out.print(str.substring(pos));
	}
}
