import address_data.AddressEntry;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressEntryTest {
    @Test
    public void testGettersAndSetters() {
        AddressEntry entry = new AddressEntry("Pablito", "Perez", "Calle x", "Coatzacoalcos", "Veracruz", "12345", "pablito.perez@example.com", "123-456-7890");

        // Test getters
        assertEquals("Pablito", entry.getName());
        assertEquals("Perez", entry.getLastName());
        assertEquals("Calle x", entry.getStreet());
        assertEquals("Coatzacoalcos", entry.getCity());
        assertEquals("Veracruz", entry.getState());
        assertEquals("12345", entry.getPostalCode());
        assertEquals("pablito.perez@example.com", entry.getEmail());
        assertEquals("123-456-7890", entry.getPhoneNumber());

        // Test setters
        entry.setName("Jaime");
        entry.setLastName("Smith");
        entry.setStreet("Calle F");
        entry.setCity("Coatzacoalcos");
        entry.setState("Tabasco");
        entry.setPostalCode("67890");
        entry.setEmail("jaime.smith@example.com");
        entry.setPhoneNumber("098-765-4321");

        assertEquals("Jaime", entry.getName());
        assertEquals("Smith", entry.getLastName());
        assertEquals("Calle F", entry.getStreet());
        assertEquals("Coatzacoalcos", entry.getCity());
        assertEquals("Tabasco", entry.getState());
        assertEquals("67890", entry.getPostalCode());
        assertEquals("jaime.smith@example.com", entry.getEmail());
        assertEquals("098-765-4321", entry.getPhoneNumber());
    }

    @Test
    public void testToString() {
        AddressEntry entry = new AddressEntry("Pablito", "Perez", "Calle x", "Coatzacoalcos", "Veracruz", "12345", "pablito.perez@example.com", "123-456-7890");
        String expected = "Name: Pablito, Last Name: Perez, Street: Calle x, City: Coatzacoalcos, State: Veracruz, Postal Code: 12345, Email: pablito.perez@example.com, Phone Number: 123-456-7890";
        assertEquals(expected, entry.toString());
    }
}

