package com.wd.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wd.entity.Book;

public interface BookService {
	public void addBook(String path, CommonsMultipartFile file, Book book) throws IOException;
	
	public void updateBook(Book book);
	
	public void deleteBook(int id,String pic);
	
	public List<Book> getAllBook();
}
