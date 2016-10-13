package com.practise;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Colections {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		boolean b = list.add(12);
		System.out.println(b);
		list.add(100);
		list.add(3223);
		list.add(12);
		System.out.println(list);
		/*Iterator<Integer> elements = list.iterator();
		while(elements.hasNext()) {
			Integer partNumObj = elements.next();
			int partNum = partNumObj.intValue();
			
			System.out.println(partNum);
		}*/
		for(int i : list) {
			System.out.println(i);
		}
	}

}
