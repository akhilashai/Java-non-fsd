package Java8Features1;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.of(10,10, 10);
		LocalTime start = LocalTime.of(8, 30).withMinute(now.getMinute());
		LocalTime end = LocalTime.of(12, 30).withMinute(now.getMinute());
		long timePassed = now.until(start, ChronoUnit.HOURS);
		long timeToGo = now.until(end, ChronoUnit.HOURS);
		System.out.println(timePassed +" "+timeToGo);
		

	}

}
