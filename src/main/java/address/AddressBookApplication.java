package address;

import address_data.AddressBook;

import java.util.Scanner;

public class AddressBookApplication {

    private AddressBook addressBook = new AddressBook();
    private Menu menu = new Menu();
    private Scanner scanner;

    public void start() {
        menu.displayMenu(addressBook, scanner);
    }

    public static void main(String[] args) {
        AddressBookApplication app = new AddressBookApplication();
        app.start();
    }
}
