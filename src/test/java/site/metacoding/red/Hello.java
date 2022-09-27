package site.metacoding.red;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class Hello {

	class HelloA {
		private String name;
		private String position;
	}
	
	@Test
	public void 테스트() {
		Map<String, String> d = new HashMap<>();
		d.put("name", "홍길동");
		d.put("position", "내야수");
		d.put("id", "1");
	}
}
