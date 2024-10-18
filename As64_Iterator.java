package basicprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class As64_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
List li=new ArrayList();
li.add(70);
li.add(90);

Iterator i1=li.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}
	}}