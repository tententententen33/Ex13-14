import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekJudge {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2026, 5, 2);
		
		if(d.getDayOfWeek() == DayOfWeek.SATURDAY || 
				d.getDayOfWeek() == DayOfWeek.SUNDAY) {
			System.out.println("休日です");
		}else {
			System.out.println("平日です");
		}
	}
}
