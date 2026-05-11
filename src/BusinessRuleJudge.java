import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class BusinessRuleJudge {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2026, 5, 11, 10, 30, 0);
		boolean weekday = dt.getDayOfWeek() != DayOfWeek.SATURDAY &&
				dt.getDayOfWeek() != DayOfWeek.SUNDAY;
		boolean officeHour = dt.getHour() >= 9 && dt.getHour() < 17;

		if (weekday && officeHour) {
			System.out.println("受付できます");
		} else {
			System.out.println("受付時間外です");
		}
	}
}