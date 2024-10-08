package basicprogram;

public class Arithmatic_Globalvariable {
int a=5;
int b=10;
void  add()
{
int sum=a+b;
System.out.println(sum);
}
void add(int a,float b)
{
float sub=b-a;
System.out.println(sub);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic_Globalvariable ag=new Arithmatic_Globalvariable();
		ag.add();
		ag.add(2,4.2f);
	}

}
