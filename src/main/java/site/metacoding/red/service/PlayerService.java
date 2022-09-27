package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.team.TeamInsertReqDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	
	private final PlayerDao playerDao;

	public List<Player> 목록보기(){
		return playerDao.findAll();
	}
	

}
