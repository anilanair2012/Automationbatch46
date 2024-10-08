package basicprogram;

public class As13_Thread_sleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
for(int i=1;i<10;i++)
{
	System.out.println(Math.random());
	Thread.sleep(1000);
}
	}

}
