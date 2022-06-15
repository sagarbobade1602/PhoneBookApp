package com.BikkadIT.PhoneBookApp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.PhoneBookApp.Model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable>{
	
	

}
