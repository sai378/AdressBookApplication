public class Main {
    public static void main(String[] args) {
        AddressBook model = new AddressBook();
        AddressBookView view = new AddressBookView();
        AddressBookController controller = new AddressBookController(model, view);

        controller.start();
    }
}