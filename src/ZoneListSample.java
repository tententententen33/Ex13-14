import java.time.ZoneId;

public class ZoneListSample {
	public static void main(String[] args) {
		for(var id : ZoneId.getAvailableZoneIds()) {
			System.out.println(id);
		}
	}
}
