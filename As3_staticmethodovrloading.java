package basicprogram;

public class As3_staticmethodovrloading {
static void add(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}
static void add(int a,double b)
{
	double sum=b-a;
	System.out.println(sum);
}
static void add(float a,float b)
{
	float sum=a*b;
	System.out.println(sum);
}
static void add(int a,float b)
{
	float sum=a/b;
	System.out.println(sum);
}
static void add()
{
	int a=5;
	double b=2.0;
	double sum=a%b;
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		As3_staticmethodovrloading .add(5,6);
add(6,7.1);
add(4.24f,2);
add(4,2.2f);
add();
	}

}
