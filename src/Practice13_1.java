import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Practice13_1 {
	public static void main(String[] args) {
		System.out.println("日時 : " + LocalDateTime.now());
		System.out.println("地域付き日時 : " + ZonedDateTime.now());
		System.out.println("日付 : " + LocalDate.now());
		System.out.println("時刻 : " + LocalTime.now());
	}
}