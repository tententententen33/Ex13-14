import java.time.LocalDate;

public class CompareLocalDate {
	public static void main(String[] args) {
		LocalDate report = LocalDate.of(2026, 5, 10);
		LocalDate exam = LocalDate.of(2026, 5, 17);
		
		System.out.println("提出日と試験日は同じか:" + report.equals(exam));
		System.out.println("提出日は試験日より前か:" + report.isBefore(exam));
		System.out.println("提出日は試験日より後か:" + report.isAfter(exam));
	}
}
