package AulaAgo28;

import java.util.Calendar;

public class TesteCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		c.set(Calendar.YEAR, 1993);
		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DAY_OF_MONTH, 28);
		c.set(Calendar.HOUR_OF_DAY, 17);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
	}
}
