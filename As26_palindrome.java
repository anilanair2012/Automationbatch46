package basicprogram;

public class As26_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="RADAR";
String b="";
for(int i=a.length()-1;i>=0;i--)
{
	char c1=a.charAt(i);
	b=b+c1;
}
System.out.println(b);
	boolean b1=a.equals(b);
	{
		if(b1==true)
		System.out.println("palindrome");
	}
}
	}


