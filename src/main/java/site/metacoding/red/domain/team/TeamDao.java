package site.metacoding.red.domain.team;

import java.util.List;

public interface TeamDao {
	public List<Team> findAll();
	public Team findById(Integer id);
	public void insert(Team stadium);
	public void update(Integer id, Team stadium);
	public void deleteById(Integer id);
}
