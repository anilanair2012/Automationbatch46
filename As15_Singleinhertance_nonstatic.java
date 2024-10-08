package basicprogram;
class nonstatic
{
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
}
public class As15_Singleinhertance_nonstatic extends nonstatic{
	
		void mul(int a,int b)
		{
			int mul=a*b;
		
		System.out.println(mul);
		}
		void div(int a,int b)
		{
			int div=a/b;
		
			System.out.println(div);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		As15_Singleinhertance_nonstatic s1=new As15_Singleinhertance_nonstatic();
		s1.add(2,3);
		s1.sub(5,3);
		s1.mul(2,5);
		s1.div(10,2);
	}

}