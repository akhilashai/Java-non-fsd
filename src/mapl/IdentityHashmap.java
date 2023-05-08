package mapl;

import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;

public class IdentityHashmap {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		Map<Integer, String> map =new HashMap<>();
		map.put(i1, "akhila");
		map.put(i2, "haleema");
		
	
		//when 2 key values have the same value then hashmap ovverrides it
		System.out.println(map);
		
		
				Map<Integer, String> map1 =new IdentityHashMap<>();
		map1.put(i1, "akhila");
		map1.put(i2, "haleema");
		
		
		//when 2 key values have the same value then hashmap ovverrides it
		System.out.println(map1);		
		
		
		
	}

}
