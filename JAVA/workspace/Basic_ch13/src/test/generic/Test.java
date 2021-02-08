package test.generic;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("Hi");
		
		Object[] array=new String[10];
		array[0] = "Hi";
		array[1]=new Integer(1);
		array[2]=new Long(2L);
		
//		int[] all=new int[10];
//		all[0]=1;
//		
//		List list2=new ArrayList<>();
//		list2.add(1);
//		
//
//		Integer o1=new Integer(1);
//		Integer o2=new Integer(1);
//		list2.add(o1);
//		list2.add(o2);
//		list2.add(1); // auto boxing (p. 527)
	}
}
