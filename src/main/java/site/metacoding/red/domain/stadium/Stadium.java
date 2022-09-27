package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Stadium {
	private Integer id;
	private String name;
	private Timestamp createdAt;
	
	// 엔티티가 아닌 필드
	private Integer no;
}	
