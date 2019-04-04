package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int authorid;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNo;
	
public int getAuthorid() {
	return authorid;
}

public void setAuthorid(int authorid) {
	this.authorid = authorid;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPhoneNo() {
	return phoneNo;
}

/*public void setPhoneNo(long string) {
	this.phoneNo = string;
}*/

public void setPhoneNo(String string) {
	this.phoneNo=string;
	
}

}
