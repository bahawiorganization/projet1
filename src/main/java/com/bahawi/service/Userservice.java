package com.bahawi.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bahawi.dao.Userdao;
import com.bahawi.entities.Etudiant;
import com.bahawi.entities.Person;

@Service("testservice")
public class Userservice {
	
	@Autowired
	Userdao testdao;
	
	 
	  public List<Etudiant>findAll() {
	    List users = testdao.findAll();
	    return users;
	  }
	  
	
		 public Person get( Integer id ) {
		
			  Person person = (Person) testdao.get(id);
			  
			  return person;
			 }
	
			 public void add(Person person) 
			 {
			  
			  testdao.add(person);
			 }

}
