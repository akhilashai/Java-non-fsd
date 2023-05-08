package Java8Features;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Data1> set1 = new HashSet();
		set1.add(new Data1(1));
		Set<Data1> set2 = Collections.unmodifiableSet(set1);
		set2.stream().findAny().get().number=2;
		int number =set1.stream().findAny().get().number;
		System.out.println(number);
		

	}

}
