package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import demo.Test;

public class CustomObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Test> al=new LinkedList<>();
		
		
		al.add(new Test("A"));
		al.add(new Test("BBB"));
		al.add(new Test("CCC"));
		//al.add("msg");
		System.out.println(al);
		
	}

}
