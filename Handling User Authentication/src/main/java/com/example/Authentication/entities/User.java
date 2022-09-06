package com.example.Authentication.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user1")

public class User {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer id;

	    private String name;

	    private String email;

	    private String password;
	    
	    public User(String name, String email, String password) {
	    	this.name = name;
	    	this.email = email;
	    	this.password = password;
	    }
	    
	    public User() {
	    	
	    }
	    

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

//	    //Do I need this?
//	    public Integer getId() {
//	        return id;
//	    }
	//    
//	    //Do I need this?
//	    public void setId(Integer id) {
//	        this.id = id;
//	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    @Override
	    public String toString() {
	    	
	    	return "<br><h3>" + name + " [" + id + "]:" + "</h3><h4>email: " + email + "</h4><h4>password: " + password + "</h4><br>";
	    }

}
