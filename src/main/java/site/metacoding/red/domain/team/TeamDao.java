package site.metacoding.red.domain.team;

import java.util.List;

public interface TeamDao {
	public List<Team> findAll();
	public Team findById(Integer id);
	public void insert(Team team);
	public void update(Integer id, Team team);
	public void deleteById(Integer id);
}
