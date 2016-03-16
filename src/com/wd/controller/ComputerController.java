package com.wd.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wd.entity.Computer;
import com.wd.service.ComputerService;


@Controller
public class ComputerController {
	//自动注入以下参数
	@Autowired
	private ComputerService computerService;
	public void setcomputerService(ComputerService computerService) {
		this.computerService = computerService;
	}
	//Springmvc定义请求的地址
	
	@RequestMapping("/addcomputer")
	public String add(@RequestParam("file")CommonsMultipartFile file,HttpServletRequest req,Computer computer) throws IOException{
		@SuppressWarnings("deprecation")
		String path = req.getRealPath("/upload");
		computerService.addComputer(path,file,computer);
		return "/listcomputer.do";
	}
	
	@RequestMapping("/deletecomputer")
	public String delete(int id,String pic,HttpServletRequest req){
		String dstPath = req.getSession().getServletContext().getRealPath("/upload")+"//"+pic;
		computerService.deleteComputer(id,dstPath);
		return "/listcomputer.do";
	}
	
	@RequestMapping("/updatecomputer")
	public String update(Computer computer){
		computerService.updateComputer(computer);
		return "/listcomputer.do";
	}
	
	@RequestMapping("/listcomputer")
	public String list(ModelMap map){
		map.addAttribute("list", computerService.getAllComputer());
		return "/backpages/listcomputer.jsp";
	}
	
	@RequestMapping("/computer")
	public String stageList(ModelMap map){
		map.addAttribute("list", computerService.getAllComputer());
		return "/stagepages/stagecomputer.jsp";
	}
	
}