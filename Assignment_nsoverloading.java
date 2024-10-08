package basicprogram;

public class Assignment_nsoverloading {

	
		// TODO Auto-generated method stub
		void add(int a,int b)
		{
			
			int Sum=a+b;
			System.out.println(Sum);
		}
		void add(double c,int d)
		{
			
			double Sub=d-c;
			System.out.println(Sub);
		}
		
		void add(double e,double f)
		{
		
			double mul=e*f;
			System.out.println(mul);
		}
		
		void add()
		{
	int g=1;int h=1;
		int div=g/h;
			System.out.println(div);
		}
		void add(float i,float j)
		{
		
			float mod=i%j;
			System.out.println(mod);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Assignment_nsoverloading a2=new Assignment_nsoverloading();
			a2.add(5,6);
			a2.add(5.67,7);
			a2.add(8,6.287);
			a2.add();
			a2.add(100.0f,5.0f);
			


	}}


