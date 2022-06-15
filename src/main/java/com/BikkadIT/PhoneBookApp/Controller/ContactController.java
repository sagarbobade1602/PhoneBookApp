package com.BikkadIT.PhoneBookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.PhoneBookApp.Model.Contact;
import com.BikkadIT.PhoneBookApp.Service.ContactServiceI;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value="/saveContact",consumes="APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		
		boolean save=contactServiceI.saveContact(contact);
		
		if(save == true) {
			String msg="Contact saved sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {
			String msg="Contact not saved sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
		
		
	
}
}