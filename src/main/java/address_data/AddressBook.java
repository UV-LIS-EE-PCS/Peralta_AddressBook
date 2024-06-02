package address_data;

import java.util.ArrayList;
import java.util.List;

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
