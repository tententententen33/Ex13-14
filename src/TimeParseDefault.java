import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeParseDefault {
	public static void main(String[] args) {
		System.out.println(LocalDate.parse("2024-01-10"));
		System.out.println(LocalDateTime.parse("2024-01-10T10:20:30"));
	}
	
}
