package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map  HashMap Hashtable, ,LinkedHashMap
		//key , value
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		hm.put(19999,"Raju");
		hm.put(1344,"x");  //xxxx b1=x
		hm.put(3344,"Raju");
		hm.put(677,"YYY");
		hm.put(1344,"ZZ");//xxxx b1=ZZ
		System.out.println(hm);
		/*Set<Integer> keySet=hm.keySet();
		for(Integer key:keySet) {
			System.out.println(key+"  "+hm.get(key));
		}*/
		
		
		//System.out.println(hm.get(19999));
	}

}
