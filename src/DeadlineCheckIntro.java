import java.time.LocalDateTime;

public class DeadlineCheckIntro {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime limit = LocalDateTime.of(2026, 5, 1, 17, 0, 0);
		
		System.out.println("現在:" + now);
		System.out.println("締切:" + limit);
		
		if(now.isAfter(limit)) {
			System.out.println("受付終了");
		}else {
			System.out.println("まだ受付中");
		}
	}
}
