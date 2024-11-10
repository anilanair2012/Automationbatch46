package basicprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class As71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> m1=new HashMap<String,Integer>();
m1.put("Apple", 1);
m1.put("Orange", 2);
m1.put("Mango",9);
m1.remove("Apple");
System.out.println(m1.values());
Set<Map.Entry<String,Integer>> m2=m1.entrySet();//Map.Entry is a nested interface within the Map interface, which represents each individual key-value pair as an object.
System.out.println(m2);

}
}