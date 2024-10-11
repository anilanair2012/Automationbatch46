package basicprogram;

public class As34_Arraychecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]value=new int[4];
value[0]=20;
value[1]=30;
value[2]=50;
value[3]=78;

int checkno=50;
for (int i=0;i<4;i++)
{
	if(checkno==value[i])
	{
		System.out.println(checkno +" is present in the index position " + i);
	}
}

	
	}

}
