import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Review13 {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2026,  4, 29);
		LocalTime t = LocalTime.of(9, 30, 0);
		LocalDateTime dt = LocalDateTime.of(d, t);
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(dt);
	}
}
