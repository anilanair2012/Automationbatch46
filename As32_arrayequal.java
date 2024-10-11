package basicprogram;

import java.util.Arrays;

public class As32_arrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr1=new int[3];
int[]arr2=new int[3];
arr1[0]=1;
arr1[1]=10;
arr1[2]=100;
arr2[0]=1;
arr2[1]=10;
arr2[2]=100;
 boolean b1=Arrays.equals(arr1, arr2);
	
	{
		if(b1==true)
		{
		System.out.println("arrays are equal");}
	
		else
		{
			System.out.println("Arrays are not equal");}
}
	}
}

	
