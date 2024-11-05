package basicprogram;

public class As75_thiskeyword {
String password="abc";
void method(String password)
{
	this.password=password;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		As75_thiskeyword as=new As75_thiskeyword();
//String password="123";
as.method("123");
System.out.println(as.password);
	

	}}