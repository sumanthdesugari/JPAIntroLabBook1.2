package com.cg.client;

import com.cg.entities.Author;
import com.cg.service.AuthorService;
import com.cg.service.AuthorServiceIMPL;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AuthorService service=new AuthorServiceIMPL();
		AuthorService service1=new AuthorServiceIMPL();
		
		//data into object1
		Author author=new Author();
		author.setAuthorid(1001);
		author.setFirstName("ram");
		author.setMiddleName("raheem");
		author.setLastName("krishna");
		author.setPhoneNo("9885520273");
		service.addAuthor(author);
		
		//data into object2
		Author author1=new Author();
		author1.setAuthorid(1002);
		author1.setFirstName("Mahendra");
		author1.setMiddleName("Singh");
		author1.setLastName("Dhoni");
		author1.setPhoneNo("8074809539");
		service.addAuthor(author1);
		
		
		
		author = service.findAuthorById(1001);
		System.out.print("Author ID:"+author.getAuthorid());
		System.out.println("First Name:"+author.getFirstName());
		System.out.println("Middle Name:"+author.getMiddleName());
		System.out.println("Last Name:"+author.getLastName());
		System.out.println("PhoneNo:"+author.getPhoneNo());
		

		author1 = service1.findAuthorById(1002);
		System.out.print("Author ID:"+author1.getAuthorid());
		System.out.println("First Name:"+author1.getFirstName());
		System.out.println("Middle Name:"+author1.getMiddleName());
		System.out.println("Last Name:"+author1.getLastName());
		System.out.println("PhoneNo:"+author1.getPhoneNo());
		//updating the lastname in author(object1)
		author.setLastName("Bheem");
		service.updateAuthor(author);
		
		author = service.findAuthorById(1001);
		System.out.print("Author ID:"+author.getAuthorid());
		System.out.println("First Name:"+author.getFirstName());
		System.out.println("Middle Name:"+author.getMiddleName());
		System.out.println("Last Name:"+author.getLastName());
		System.out.println("PhoneNo:"+author.getPhoneNo());
	
		
		author1 = service1.findAuthorById(1002);
		System.out.print("Author ID:"+author1.getAuthorid());
		System.out.println("First Name:"+author1.getFirstName());
		System.out.println("Middle Name:"+author1.getMiddleName());
		System.out.println("Last Name:"+author1.getLastName());
		System.out.println("PhoneNo:"+author1.getPhoneNo());
		
		
		//at this breakpoint, record is removed from table
		service.removeAuthor(author);
		System.out.println("End of program...");
	

	}

}
