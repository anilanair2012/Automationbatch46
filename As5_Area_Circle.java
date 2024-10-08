package basicprogram;

import java.util.Scanner;

public class As5_Area_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of pi");
		double pi=s1.nextDouble();
		System.out.println("Enter the value of r");
		int r=s1.nextInt();
		double area=(pi)*r*r;
		System.out.println(area);
	}

}
