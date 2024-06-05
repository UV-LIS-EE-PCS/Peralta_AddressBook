package address_data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.*;
public class AddressBook {

    private List<AddressEntry> entries;

    public AddressBook() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(AddressEntry entry){
        entries.add(entry);
    }
    public void removeEntry(String apellido) {
        entries = entries.stream()
                .filter(entry -> !entry.getLastName().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
    }
    public void readFromFile(String filename) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filename).getFile());

        try (BufferedReader BR = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = BR.readLine()) != null) {
                String[] newContacts = line.split(","); // Asumiendo que los campos están separados por comas
                if (newContacts.length == 8) {
                    AddressEntry entry = new AddressEntry(newContacts[0], newContacts[1], newContacts[2], newContacts[3], newContacts[4], newContacts[5], newContacts[6], newContacts[7]);
                    addEntry(entry);
                } else {
                    System.err.println("Invalid entry format: " + line);
                }
            }
            System.out.println("The file has been uploaded successfully");
        } catch (IOException e) {
            System.err.println("Something has gone wrong, try again " + e.getMessage());
        }
    }
    public AddressEntry findEntryByLastName(String lastName) {
        for (AddressEntry entry : entries) {
            if (entry.getLastName().equalsIgnoreCase(lastName)) {
                return entry;
            }
        }
        return null;
    }
    public List<AddressEntry> searchEntry(String apellido) {
        return entries.stream()
                .filter(entry -> entry.getLastName().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
    }
    public List<AddressEntry> getEntries() {
        return new ArrayList<>(entries);
    }

    public void displayEntries() {
        for (AddressEntry entry : entries) {
            System.out.println(entry);
        }
    }
}
