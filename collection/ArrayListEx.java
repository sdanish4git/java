package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import demo.Test;
import polyrun.ATM;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*Test t=new Test();
		System.out.println(t);
		int i=10;
		Integer i=new Integer(5);
		* 
		*/
		
		/*ArrayList al=new ArrayList();  //growable array
		al.add("A");
		al.add("B");
		al.add(5);  //new Integer(5)  //  AutoBoxing //
		al.add("C");
		al.add("D");
		
		System.out.println(al);*/
		
		LinkedList<String> al=new LinkedList<>();   //doubly linked list
		
		al.add("A");
		al.add("B");
		//al.add(5);  //new Integer(5)  //  AutoBoxing //
		al.add("C");
		al.add("A");
		al.add("D");
		//al.add(new Test());
		//al.add(new ATM());
		System.out.println(al);
		//System.out.println(al.get(1));
		
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i)); 
			
		}
		*/
		
		/*for(String s:al) {
			System.out.println(s);
		}*/
		
		/*Iterator<String> it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		
		
	}

}
