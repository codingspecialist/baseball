package site.metacoding.red.web.dto.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.player.Player;

@Setter
@Getter
public class PlayerInsertReqDto {
	private String name;
	private String position;
	private Integer teamId;
	
	public Player toEntity() {
		Player player = new Player();
		player.setName(this.name);
		player.setPosition(this.position);
		player.setTeamId(this.teamId);
		return player;
	}
}
