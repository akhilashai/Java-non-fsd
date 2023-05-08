package Java8Features;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList();
		l1.add(1);
		List<Integer> l2 = l1;
		l2.add(2);
		System.out.println(l2.size());

	}

}
