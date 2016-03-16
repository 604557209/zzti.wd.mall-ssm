package com.wd.dao;

import java.util.List;

import com.wd.entity.Computer;

public interface ComputerDao {
	public void addComputer(Computer computer);
	
	public void deleteComputer(int id);
	
	public void updateComputer(Computer computer);

	public List<Computer> getAllComputer();
}
