package com.cg.dao;

import com.cg.entities.Author;

public interface AuthorDAO {
	
	public abstract Author getAuthorById(int id);
	
	public abstract void addAuthor(Author author);

	public abstract void removeAuthor(Author author);

	public abstract void updateAuthor(Author author);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();
	

}
