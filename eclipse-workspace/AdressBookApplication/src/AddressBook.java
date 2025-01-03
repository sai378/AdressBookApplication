import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    // Constructor
    public AddressBook() {
    }

    // Add a contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Remove a contact by name
    public boolean removeContact(String name) {
        return contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }

    // Get all contacts
    public List<Contact> getAllContacts() {
        return contacts; 
    }

    // Search for a contact by name
    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}
