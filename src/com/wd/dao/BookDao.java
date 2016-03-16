package com.wd.dao;

import java.util.List;

import com.wd.entity.Book;

public interface BookDao {
	public void addBook(Book book);
	
	public void deleteBook(int id);
	
	public void updateBook(Book book);

	public List<Book> getAllBook();
}
