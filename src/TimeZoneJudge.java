import java.time.LocalDateTime;

public class TimeZoneJudge {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2026, 5, 10, 14, 20, 0);
		int hour = dt.getHour();

		if (hour < 12) {
			System.out.println("午前です");
		} else if (hour < 18) {
			System.out.println("午後の授業時間帯です");
		} else {
			System.out.println("夕方以降です");
		}
	}
}