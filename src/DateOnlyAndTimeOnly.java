import java.time.LocalDate;
import java.time.LocalTime;

public class DateOnlyAndTimeOnly {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2026, 4, 29);
		LocalTime t = LocalTime.of(13, 45, 0);
		
		System.out.println(d.getYear());
		System.out.println(d.getMonthValue());
		System.out.println(d.getDayOfMonth());
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
	}
}
