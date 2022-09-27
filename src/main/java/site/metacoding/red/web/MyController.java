package site.metacoding.red.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.PlayerDao;

@RequiredArgsConstructor
@RestController
public class MyController {

	private final PlayerDao playerDao;
	
	@GetMapping("/hello")
	public List<Map<String, Object>> hello() {
		List<String> teamNameList = playerDao.findTeam();
		System.out.println("===========");
		for (String teamName : teamNameList) {
			System.out.println(teamName);
		}
		System.out.println("===========");
		return playerDao.findPositionByTeam(teamNameList);

	}
}
