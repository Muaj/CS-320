package Classes;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (!contacts.containsKey(contact.getContactId())) {
            contacts.put((String) contact.getContactId(), contact);
        } else {
            throw new IllegalArgumentException("Contact ID must be unique");
        }
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateContactField(String contactId, String field, String value) {
        if (contacts.containsKey(contactId)) {
            Contact contact = contacts.get(contactId);
            switch (field) {
                case "firstName":
                    contact.setFirstName(value);
                    break;
                case "lastName":
                    contact.setLastName(value);
                    break;
                case "phone":
                    contact.setPhone(value);
                    break;
                case "address":
                    contact.setAddress(value);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid field to update");
            }
        } else {
            throw new IllegalArgumentException("Contact not found");
        }
    }

	public Map<String, Contact> getContacts() {
		return new HashMap<>(contacts);
	}
    }
    