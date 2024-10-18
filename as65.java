package basicprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class as65 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	List l1=new ArrayList();
	l1.add(45);
	l1.add(90);
	l1.add(100);
	ListIterator l2=l1.listIterator();
	
	while(l2.hasNext())
	{
		System.out.println(l2.next());
	}
	while(l2.hasPrevious())
	{
		System.out.println(l2.previous());
	}
}
}
