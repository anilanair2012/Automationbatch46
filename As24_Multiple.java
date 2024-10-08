/*WAP on multiple level inheritance using Interface*/
package basicprogram;
interface learn
{
void learn1();

}


interface Parent
{
	void learn2();
}
public class As24_Multiple implements Parent,learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		As24_Multiple as=new As24_Multiple();
		as.learn1();
		as.learn2();


	

	

}

	@Override
	public void learn1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void learn2() {
		// TODO Auto-generated method stub
		
	}
}