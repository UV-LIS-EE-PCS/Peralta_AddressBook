package address;

import address_data.AddressBook;
import address_data.AddressEntry;

import java.util.List;
import java.util.Scanner;
/**
 * Representa el menú de opciones para interactuar con un libro de direcciones.
 */
public class Menu {

    /**
     * Muestra el menú y maneja las diferentes opciones.
     *
     * @param addressBook el libro de direcciones
     * @param scanner     el objeto Scanner para leer la entrada del usuario
     */
    public void displayMenu(AddressBook addressBook, Scanner scanner) {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("a) Upload file");
            System.out.println("b) Add record");
            System.out.println("c) Remove record");
            System.out.println("d) Search record");
            System.out.println("e) Show records");
            System.out.println("f) Exit");

            String option = scanner.nextLine();

            switch (option.toLowerCase()) {
                case "a":
                    System.out.print("Enter the file name: ");
                    String filename = scanner.nextLine();
                    addressBook.readFromFile(filename);
                    break;
                case "b":
                    AddressEntry newEntry = createAddressEntry(scanner);
                    addressBook.addEntry(newEntry);
                    break;
                case "c":
                    System.out.print("Enter the last name of the record to be deleted: ");
                    String apellidoEliminar = scanner.nextLine();
                    addressBook.removeEntry(apellidoEliminar);
                    break;
                case "d":
                    System.out.print("Enter the last name of the record to be find: ");
                    String apellidoBuscar = scanner.nextLine();
                    List<AddressEntry> foundEntries = addressBook.searchEntry(apellidoBuscar);
                    foundEntries.forEach(System.out::println);
                    break;
                case "e":
                    addressBook.displayEntries();
                    break;
                case "f":
                    return;
                default:
                    System.out.println("Invalid option. Please, try again.");
            }
        }
    }
    /**
     * Crea una nueva entrada de dirección a partir de la entrada del usuario.
     *
     * @param scanner el objeto Scanner para leer la entrada del usuario
     * @return la nueva entrada de dirección creada
     */

    private AddressEntry createAddressEntry(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("Código Postal: ");
        String codigoPostal = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        return new AddressEntry(nombre, apellido, calle, ciudad, estado, codigoPostal, correoElectronico, telefono);
    }
}