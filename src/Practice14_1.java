import java.time.LocalDateTime;

public class Practice14_1 {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.of(2026, 5, 1, 9, 0, 0);
		LocalDateTime dt2 = LocalDateTime.of(2026, 5, 1, 13, 0, 0);

		System.out.println("等しいか: " + dt1.equals(dt2));
		System.out.println("dt1 が前か: " + dt1.isBefore(dt2));
		System.out.println("dt1 が後か: " + dt1.isAfter(dt2));
	}
}