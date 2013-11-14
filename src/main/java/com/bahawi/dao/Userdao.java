package com.bahawi.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bahawi.entities.Etudiant;
import com.bahawi.entities.Person;

@Transactional
@Repository("testdao")
public class Userdao {
	private static final int PAGE_SIZE = 50;
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	/*
	public Page<Person> findAllpage(Integer pageNumber) {
        PageRequest request =
                new PageRequest(pageNumber - 1, PAGE_SIZE, Sort.Direction.DESC, "startTime");
            return findAll(request);
	}
	*/
	
	@Transactional
	  public List<Person> findAll() {
		
		    Session session = sessionfactory.getCurrentSession();
		    List etuds = session.createQuery("from Person").list();
		    return etuds;

		}
	
	@Transactional
	 public Person get( Integer id ) {
	
		  Session session = sessionfactory.getCurrentSession();
		  
		  // Retrieve existing person first
		  Person person = (Person) session.get(Person.class, id);
		  
		  return person;
		 }
	
	@Transactional
		 public void add(Person person) 
		 {
		  
		  Session session = sessionfactory.getCurrentSession();
		  
		  // Save
		  session.save(person);
		 }

}
