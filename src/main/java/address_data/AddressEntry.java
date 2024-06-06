package address_data;

/**
 * Representa una entrada a AddressBook.
 */
public class AddressEntry {
    private String name;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String email;
    private String phoneNumber;

    /**
     * Construye un objeto AddressEntry con los detalles especificados.
     *
     * @param name        el nombre de la persona
     * @param lastName    el apellido de la persona
     * @param street      la dirección de la calle
     * @param city        la ciudad
     * @param state       el estado o provincia
     * @param postalCode  el código postal
     * @param email       la dirección de correo electrónico
     * @param phoneNumber el número de teléfono
     */

    public AddressEntry(String name, String lastName, String street, String city, String state, String postalCode, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Inician todos los getters y setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Terminan todos los getters y setters

    // Devuelve los registros en forma amigable con el usuario
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Last Name: " + lastName + "\n" + "Street: " + street + "\n" + "City: " + city +
                "\n" + "State: " + state + "\n" + "Postal Code: " + postalCode + "\n" + "Email: " + email + "\n" +
                "Phone Number: " + phoneNumber + "\n" + "\n";
    }
}
