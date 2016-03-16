package com.wd.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wd.entity.Computer;

public interface ComputerService {
	public void addComputer(String path, CommonsMultipartFile file, Computer computer) throws IOException;
	
	public void updateComputer(Computer computer);
	
	public void deleteComputer(int id,String pic);
	
	public List<Computer> getAllComputer();
}
