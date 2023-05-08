package mapl;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;


public class NavigableMaps {
	
	public static void main(String args[])
	{
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("A", "Akhila");
		map.put("B", "Begum");
		map.put("C", "charitha");
		map.put("E", "Ella");
		
		System.out.println(map);
		
		System.out.println(map.ceilingKey("D"));
		System.out.println(map.floorKey("B"));
		System.out.println(map.lowerKey("B"));
		System.out.println(map.higherKey("B"));
		System.out.println(map.pollLastEntry());
		System.out.println(map.pollFirstEntry());
		System.out.println(map.descendingMap());
		
	}

}
