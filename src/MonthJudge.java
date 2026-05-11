import java.time.LocalDate;
import java.time.Month;

public class MonthJudge {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2026, 4, 29);

		if (d.getMonth() == Month.APRIL) {
			System.out.println("4 月です");
		} else {
			System.out.println("4 月ではありません");
		}
	}
}