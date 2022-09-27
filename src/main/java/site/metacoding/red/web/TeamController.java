package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.service.TeamService;

@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamService teamService;
	
	@GetMapping("/team")
	public String list(Model model) {
		List<Team> teamList = teamService.목록보기();
		model.addAttribute("teamList", teamList);
		return "team/list";
	}
}
