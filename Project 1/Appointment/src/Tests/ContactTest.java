package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Classes.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("123456789", "John", "Doe", "123456789", "123 Sesame St");
		assertTrue(contact.getContactId().equals("123456789"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getPhone().equals("123456789"));
		assertTrue(contact.getAddress().equals("123 Sesame St"));
		
	}
	
	@Test
	void testContactTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
		Contact contact = new Contact("1234567890000", "John", "Doe", "123456789", "123 Sesame St");
		});
		
		
	}

}
