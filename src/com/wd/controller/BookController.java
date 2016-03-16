package com.wd.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wd.entity.Book;
import com.wd.service.BookService;


@Controller
public class BookController {
	//自动注入以下参数
	@Autowired
	private BookService bookService;
	public void setbookService(BookService bookService) {
		this.bookService = bookService;
	}
	//Springmvc定义请求的地址
	
	@RequestMapping("/addbook")
	public String add(@RequestParam("file")CommonsMultipartFile file,HttpServletRequest req,Book book) throws IOException{
		@SuppressWarnings("deprecation")
		String path = req.getRealPath("/upload");
		bookService.addBook(path,file,book);
		return "/listbook.do";
	}
	
	@RequestMapping("/deletebook")
	public String delete(int id,String pic,HttpServletRequest req){
		String dstPath = req.getSession().getServletContext().getRealPath("/upload")+"//"+pic;
		bookService.deleteBook(id,dstPath);
		return "/listbook.do";
	}
	
	@RequestMapping("/updatebook")
	public String update(Book book){
		bookService.updateBook(book);
		return "/listbook.do";
	}
	
	@RequestMapping("/listbook")
	public String list(ModelMap map){
		map.addAttribute("list", bookService.getAllBook());
		return "/backpages/listbook.jsp";
	}
	
	@RequestMapping("/book")
	public String stageList(ModelMap map){
		map.addAttribute("list", bookService.getAllBook());
		return "/stagepages/stagebook.jsp";
	}
}