package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;

@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamDao teamDao;

	public List<Team> 목록보기(){
		return teamDao.findAll();
	}
}
