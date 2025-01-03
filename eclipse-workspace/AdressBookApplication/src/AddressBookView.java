import java.util.List;

public class AddressBookView {
    public void showMenu() {
        System.out.println("=== Address Book Menu ===");
        System.out.println("1. Add Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Search Contact");
        System.out.println("4. Remove Contact");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("=== Contact List ===");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayContact(Contact contact) {
        if (contact != null) {
            System.out.println("Contact Found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }
}
