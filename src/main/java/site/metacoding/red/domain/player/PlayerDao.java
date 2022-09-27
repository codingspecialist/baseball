package site.metacoding.red.domain.player;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PlayerDao {
	public List<Player> findAll();
	public Player findById(Integer id);
	public void insert(Player player);
	public void update(Integer id, Player player);
	public void deleteById(Integer id);
	
	// 테스트
	public List<String> findTeam();
	public List<Map<String, Object>> findPositionByTeam(@Param("teamNameList") List<String> teamNameList);
}
