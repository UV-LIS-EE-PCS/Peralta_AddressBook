package address;

import address_data.AddressBook;
import address_data.AddressEntry;

import java.util.Scanner;

public class AddressBookAplication {
    public static void main(String [] args){

        AddressBook addressBook = new AddressBook();

        AddressEntry entry1 = new AddressEntry("Juan","Perez", "Calle Cinco 5", "Cardenas", "Tabasco","86500","juan.perez@example.com","9373711234");
        AddressEntry entry2 = new AddressEntry("Pablito","Ozuna","Calle Lagunas 3","Coatzacoalcos","Veracruz","96500","Pablito.Ozuna@example.com","9221701313");

        addressBook.addEntry(entry1);
        addressBook.addEntry(entry2);

        addressBook.displayEntries();
    }
}
