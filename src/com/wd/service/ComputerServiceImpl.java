package com.wd.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wd.dao.ComputerDao;
import com.wd.entity.Computer;


@Service("computerService")
public class ComputerServiceImpl implements ComputerService{
	@Autowired
	private ComputerDao computerDao;
	public void setcomputerDao(ComputerDao computerDao) {
		this.computerDao = computerDao;
	}
	
	public void addComputer(String path,CommonsMultipartFile file,Computer computer) throws IOException {
		//文件类型
		String type = file.getOriginalFilename();
		type = type.substring(type.lastIndexOf(".")+1);
		//文件名
		Date date = new Date();
		StringBuffer pic = new StringBuffer();
		pic.append(date.getTime());
		pic.append(".");
		pic.append(type);
		//输出文件到服务器
		InputStream is = file.getInputStream();
		OutputStream os = new FileOutputStream(new File(path,pic.toString()));
		int len = 0;
		byte[] buffer = new byte[400];
		while((len = is.read(buffer)) != -1){
			os.write(buffer, 0, len);
		}
		os.close();
		is.close();
		computer.setPic(pic.toString());
		computerDao.addComputer(computer);
	}
	
	public void deleteComputer(int id,String pic) {
		deleteFile(pic);
		computerDao.deleteComputer(id);
	}
	
	public void updateComputer(Computer computer) {
		computerDao.updateComputer(computer);
	}
	
	public List<Computer> getAllComputer() {
		return computerDao.getAllComputer();
	}
	
	private static boolean deleteFile(String sPath) {  
	    boolean flag = false;  
	    File file = new File(sPath);  
	    // 路径为文件且不为空则进行删除  
	    if (file.isFile() && file.exists()) {  
	        file.delete();  
	        flag = true;  
	    }  
	    return flag;  
	}
}