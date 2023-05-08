package mapl;

import java.util.Map;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("akhila", 1);
		map.put("nagurvali", 2);
		map.put("begum", 3);
		map.put("haleema", 4);
		map.put("imran", 5);
		
		Set<String >key =map.keySet();
		System.out.println(key);
		
		Collection<Integer> value = map.values();
		System.out.println(value);
		
		for(String set : key)
		{
			System.out.println("key : "+key +"  "+"values : "+value);
		}
		
		Iterator<String> it=key.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() );
		}
		
	}

}
