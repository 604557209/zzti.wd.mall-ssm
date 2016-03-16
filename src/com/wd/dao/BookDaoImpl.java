package com.wd.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wd.entity.Book;

@Repository("bookDao")
public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao {
	@Autowired
	public void setSqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public void addBook(Book book) {
		getSqlSession().insert("com.wd.entity.mall.book.mapper.addBook", book);
	}

	public void deleteBook(int id) {
		getSqlSession().delete("com.wd.entity.mall.book.mapper.deleteBook", id);
	}

	public void updateBook(Book book) {
		getSqlSession().update("com.wd.entity.mall.book.mapper.updateBook", book);
	}
	
	public List<Book> getAllBook() {
		return getSqlSession().selectList("com.wd.entity.mall.book.mapper.getAllBook");
	}
}
