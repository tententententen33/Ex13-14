import java.time.LocalDateTime;

public class TimeEquals {
	public static void main(String[] args) {
		var dt1 = LocalDateTime.of(2023, 12, 31, 10, 20, 30);
		var dt2 = LocalDateTime.of(2024, 1,10, 10, 20, 30);
		
		System.out.println(dt1.equals(dt2));
		System.out.println(dt1.isBefore(dt2));
		//isBeforeは、dt1がdt2より前の日付か
		System.out.println(dt1.isAfter(dt2));
		//isAfterは、dt1がdt2より後の日付か
	}
}
