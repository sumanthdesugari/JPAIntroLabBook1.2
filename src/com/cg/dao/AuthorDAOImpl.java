package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Author;


public class AuthorDAOImpl implements AuthorDAO {
	private EntityManager entitymanager;
	
	public AuthorDAOImpl() {
		entitymanager=JPAUtil.getEntityManager();
	
	}

	@Override
	public Author getAuthorById(int id) {
		// TODO Auto-generated method stub
		Author author = entitymanager.find(Author.class, id);
		return author;
	}

	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		entitymanager.persist(author);
		
	}

	@Override
	public void removeAuthor(Author author) {
		// TODO Auto-generated method stub
		entitymanager.remove(author);
		
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		entitymanager.merge(author);
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entitymanager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entitymanager.getTransaction().begin();
		
	}
	


}
