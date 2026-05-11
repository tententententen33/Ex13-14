import java.time.LocalDateTime;

public class DeadlineJudge {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime limit = LocalDateTime.of(2026, 5, 1, 17, 0, 0);

		if (now.isAfter(limit)) {
			System.out.println("期限切れです");
		} else {
			System.out.println("まだ提出できます");
		}
	}
}