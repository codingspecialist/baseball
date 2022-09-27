package site.metacoding.red.web.dto.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Setter
@Getter
public class StadiumInsertReqDto {
	private String name;
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium();
		stadium.setName(this.name);
		return stadium;
	}
}
