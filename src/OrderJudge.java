import java.time.LocalDateTime;

public class OrderJudge {
	public static void main(String[] args) {
		LocalDateTime open = LocalDateTime.of(2026, 5, 10, 9, 0, 0);
		LocalDateTime close = LocalDateTime.of(2026, 5, 10, 17, 0, 0);
		LocalDateTime target = LocalDateTime.of(2026, 5, 10, 12, 30, 0);

		if (target.equals(open)) {
			System.out.println("開始時刻ちょうどです");
		} else if (target.isBefore(open)) {
			System.out.println("開始前です");
		} else if (target.isAfter(close)) {
			System.out.println("終了後です");
		} else {
			System.out.println("営業時間内です");
		}
	}
}