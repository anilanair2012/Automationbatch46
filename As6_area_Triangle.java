package basicprogram;

import java.util.Scanner;

public class As6_area_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
System.out.println("Enter length");
int length=s1.nextInt();
System.out.println("Enter breadth");
int breadth=s1.nextInt();
int area=(length*breadth)/2;
System.out.println("Area of triangle"+area);
	}

}
