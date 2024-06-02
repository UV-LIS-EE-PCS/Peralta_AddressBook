package address_data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class AddressBook {

    private List<AddressEntry> entries;

    public AddressBook() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(AddressEntry entry){
        entries.add(entry);
    }
    public void removeEntry(AddressEntry entry) {
        entries.remove(entry);
    }
    public void readFromFile(String filename) {
        try (BufferedReader BR = new BufferedReader(new FileReader(filename))) {
            String[] newContacts = new String[8];
            int index = 0;
            String line;
            while ((line = BR.readLine()) != null) {
                String[] fragments = line.split("\n");
                newContacts[index] = fragments[0];
                index++;
            }
            AddressEntry entry = new AddressEntry(newContacts[0], newContacts[1], newContacts[2], newContacts[3], newContacts[4], newContacts[5], newContacts[6], newContacts[7]);
            addEntry(entry);
            System.out.println("The file has been uploaded successfully");
        } catch (IOException e) {
            System.err.println("Something has gone wrong, try again" + e.getMessage());
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
    public String search(){
        return "0";
    }
    public void readContacts(){

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
