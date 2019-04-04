package com.cg.service;

import com.cg.dao.AuthorDAO;
import com.cg.dao.AuthorDAOImpl;
import com.cg.entities.Author;

public class AuthorServiceIMPL implements AuthorService{
	
	private AuthorDAO dao;
	public AuthorServiceIMPL() {
		// TODO Auto-generated constructor stub
		dao=new AuthorDAOImpl();
	}

	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void removeAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public Author findAuthorById(int id) {
		// TODO Auto-generated method stub
		
		//no need of transaction, it's an read operation
		Author author  = dao.getAuthorById(id);
		return author;
	
	}


}
