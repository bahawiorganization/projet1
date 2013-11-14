package com.bahawi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bahawi.entities.Person;

public interface UserInterface extends JpaRepository<Person, Long> {

}
