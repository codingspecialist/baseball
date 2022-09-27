package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;

// 서비스는 Dao 조합하고, 트랜잭션을 관리한다.

@RequiredArgsConstructor
@Service // IoC 등록
public class StadiumService {
	
	// DI
	private final StadiumDao stadiumDao;

	public List<Stadium> 목록보기(){
		return stadiumDao.findAll();
	}
}
