package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Classes.ContactService;
import Classes.Contact;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();

        // Create a contact
        Contact contact = new Contact("123456789", "John", "Doe", "123456789", "123 Sesame St");

        // Add the contact
        contactService.addContact(contact);

        // Verify that the contact was added
        assertTrue(contactService.getContacts().containsKey("123456789"));
	}
	
	@Test
    public void testAddContactNonUniqueID() {
        ContactService contactService = new ContactService();

        // Create two contacts with the same ID
        Contact contact1 = new Contact("123456789", "John", "Doe", "1234567890", "123 Sesame St");
        Contact contact2 = new Contact("123456789", "Jane", "Doe", "9876543210", "456 Oak St");

        // Add the first contact
        contactService.addContact(contact1);

        // Try to add the second contact with the same ID
        try {
            contactService.addContact(contact2);
            fail("Expected IllegalArgumentException for non-unique ID");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
	
	@Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();

        // Create a contact
        Contact contact = new Contact("123456789", "John", "Doe", "1234567890", "123 Sesame St");

        // Add the contact
        contactService.addContact(contact);

        // Delete the contact
        contactService.deleteContact("123456789");

        // Verify that the contact was deleted
        assertFalse(contactService.getContacts().containsKey("123456789"));
    }

    @Test
    public void testUpdateContactField() {
        ContactService contactService = new ContactService();

        // Create a contact
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Sesame St");

        // Add the contact
        contactService.addContact(contact);

        // Update the contact's first name
        contactService.updateContactField("1", "firstName", "Jane");

        // Verify that the contact's first name was updated
        assertEquals("Jane", contactService.getContacts().get("1").getFirstName());
    }

}
