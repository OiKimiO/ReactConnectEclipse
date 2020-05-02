package com.eh.homeDao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eh.homeDao.homeDao;
import com.eh.homeVo.homeVo;
import com.eh.homeservice.homeService;

@Service("homeService")
public class homeServiceImpl implements homeService {
	
	@Resource(name="homeDao")
	private homeDao homeDao;

	@Override
	public List<homeVo> readDB() {
		return homeDao.readDB();
	}
	
	

}
