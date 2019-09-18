package collection.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String,All Wrapper class,
		//String Comparable,Comparator
		Employee e1=new Employee();
		e1.setId(999);
		e1.setName("Raj");
		Employee e2=new Employee();
		e2.setId(1000);
		e2.setName("Anita");
		
		
		Employee e3=new Employee();
		e3.setId(1001);
		e3.setName("John");
		
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Before "+list);
		Collections.sort(list);
		
		System.out.println("After "+list);
	}

}
