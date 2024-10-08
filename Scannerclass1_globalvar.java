package basicprogram;

import java.util.Scanner;

public class Scannerclass1_globalvar {
 static int a;
 static int b;
static void add()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a");
	int a=s1.nextInt();
	System.out.println("Enter b");
	int b=s1.nextInt();
	int sum=a+b;
	System.out.println(sum);
	
	
;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scannerclass1_globalvar sc=new Scannerclass1_globalvar();



add();

	}

}
