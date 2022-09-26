package site.metacoding.red.domain.player;

import java.util.List;

public interface PlayerDao {
	public List<Player> findAll();
	public Player findById(Integer id);
	public void insert(Player stadium);
	public void update(Integer id, Player stadium);
	public void deleteById(Integer id);
}
