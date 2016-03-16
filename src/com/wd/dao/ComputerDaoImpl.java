package com.wd.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wd.entity.Computer;

@Repository("computerDao")
public class ComputerDaoImpl extends SqlSessionDaoSupport implements ComputerDao {
	@Autowired
	public void setSqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public void addComputer(Computer computer) {
		getSqlSession().insert("com.wd.entity.mall.computer.mapper.addComputer", computer);
	}

	public void deleteComputer(int id) {
		getSqlSession().delete("com.wd.entity.mall.computer.mapper.deleteComputer", id);
	}

	public void updateComputer(Computer computer) {
		getSqlSession().update("com.wd.entity.mall.computer.mapper.updateComputer", computer);
	}
	
	public List<Computer> getAllComputer() {
		return getSqlSession().selectList("com.wd.entity.mall.computer.mapper.getAllComputer");
	}
}
