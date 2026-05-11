import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekdayJudge {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2026, 5, 2);
		DayOfWeek w = d.getDayOfWeek();

		if (w == DayOfWeek.SATURDAY || w == DayOfWeek.SUNDAY) {
			System.out.println("休日です");
		} else {
			System.out.println("平日です");
		}
	}
}