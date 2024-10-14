package basicprogram;

import java.util.Date;

public class As50_currentdateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d1=new Date();
long d2=d1.getTime();
Date d3=new Date(d2);
System.out.println(d3.toString());


	}

}
