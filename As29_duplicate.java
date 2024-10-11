package basicprogram;

public class As29_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]name=new int[4];
name[0]=8;
name[1]=88;
name[2]=888;
name[3]=888;
if(name[2]==name[3])
{
	System.out.println("Array accepts duplicate values");
}
else
{
	System.out.println("Array does not  accepts duplicate values");
}
	}

}
