package address;

import address_data.AddressBook;
import address_data.AddressEntry;

import java.util.Scanner;

public class AddressBookAplication {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.displayMenu();
            char userInput = input.next().toLowerCase().charAt(0);

            switch (userInput) {
                //Upload file option
                case 'a':

            }

        } while (true);
    }
}
