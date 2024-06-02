package address_data;

public class AddressEntry {
    private String name;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String email;
    private String phoneNumber;

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

    @Override
    public String toString() {
        return "AddressEntry{" +
                "nombre='" + name + '\'' +
                ", apellido='" + lastName + '\'' +
                ", calle='" + street + '\'' +
                ", ciudad='" + city + '\'' +
                ", estado='" + state + '\'' +
                ", codigoPostal='" + postalCode + '\'' +
                ", correoElectronico='" + email + '\'' +
                ", telefono='" + phoneNumber + '\'' +
                '}';
    }
}
