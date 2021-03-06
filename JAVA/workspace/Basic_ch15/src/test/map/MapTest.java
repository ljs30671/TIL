package test.map;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		Hashtable map=new Hashtable();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "1");
		map.put("d", new MapTest());
		
		System.out.println(map);
		System.out.println(map.size());
		Object o1=map.get("a");
		Object o2=map.get("c");
		
		System.out.println(o1==o2);
		
		Enumeration enu=map.keys();
		while(enu.hasMoreElements()) {
			Object o=enu.nextElement();
			System.out.println(o+":"+map.get(o));
		
		}
	}

}
