package basicprogram;

public class As58_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=10;
switch(4) {
case 1:int sum=a+b;
System.out.println(sum);
break;
case 2:int dif=b-a;
System.out.println(dif);
break;
case 3:int mul=a*b;
System.out.println(mul);
break;
case 4:int div=b/a;
System.out.println(div);
break;
default:
	System.out.println("no arithmetic operation");
}

	}

}
