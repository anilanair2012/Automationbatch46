package basicprogram;

import java.util.Arrays;

public class As36_Specialchara {
	static int countofalphabet;
	static int countofdigit;	
	static int space;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Kv no 2 Adoor";
char[]c1=s.toCharArray();
System.out.println(Arrays.toString(c1));

for (int i=0;i<s.length();i++)
{
boolean b1=Character.isAlphabetic(c1[i]);
if(b1==true)
{
countofalphabet++;

}
boolean b2=Character.isDigit(c1[i]);
if(b2==true)
{
	countofdigit++;	
}
boolean b3=Character.isWhitespace(c1[i]);
if(b3==true)
{
	space++;
}
	
}
int spclcount=s.length()-(countofalphabet+countofdigit+space);
System.out.println(countofalphabet);
System.out.println(countofdigit);
System.out.println(space);
}}