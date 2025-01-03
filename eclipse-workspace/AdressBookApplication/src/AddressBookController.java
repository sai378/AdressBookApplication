import java.util.Scanner;

public class AddressBookController {
    private AddressBook model;
    private AddressBookView view;

    // Constructor
    public AddressBookController(AddressBook model, AddressBookView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            view.showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> handleAddContact(scanner);
                case 2 -> view.displayContacts(model.getAllContacts());
                case 3 -> handleSearchContact(scanner);
                case 4 -> handleRemoveContact(scanner);
                case 5 -> {
                    view.displayMessage("Exiting Address Book. Goodbye!");
                    exit = true;
                }
                default -> view.displayMessage("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private void handleAddContact(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phone, email);
        model.addContact(contact);
        view.displayMessage("Contact added successfully!");
    }

    private void handleSearchContact(Scanner scanner) {
        System.out.print("Enter Name to Search: ");
        String name = scanner.nextLine();
        Contact contact = model.searchContact(name);
        view.displayContact(contact);
    }

    private void handleRemoveContact(Scanner scanner) {
        System.out.print("Enter Name to Remove: ");
        String name = scanner.nextLine();
        boolean removed = model.removeContact(name);
        if (removed) {
            view.displayMessage("Contact removed successfully!");
        } else {
            view.displayMessage("Contact not found.");
        }
    }
}
