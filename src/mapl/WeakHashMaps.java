package mapl;

import java.io.InterruptedIOException;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMaps {

	public static void main(String[] args) throws  InterruptedException {
		
		Map<User, String> map = new WeakHashMap<>();
		User u = new User();
		map.put(u, "Tom");
		
		System.out.println(map);
		
		u = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(map);
		
		
	}

}
