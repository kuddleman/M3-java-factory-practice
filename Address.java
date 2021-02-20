public class Address {

    private String number, street, street2, city, state, zip1, zip2, country;

    private static final String DEFAULT_STREET2 ="";
    private static final String DEFAULT_ZIP2 = "";

    public Address(String number, String street, String street2, String city,
                   String state, String zip1, String zip2, String country){
        this.number = number;
        this.street = street;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip1 = zip1;
        this.zip2 = zip2;
        this.country = country;
    }
    // Telescoping constructors
    // no street2
    public Address(String number, String street, String city, String state,
                   String zip1, String zip2, String country) {
        this(number, street, DEFAULT_STREET2, city, state, zip1, zip2, country);
    }

    //no street2 nor zip2
    public Address(String number, String street, String city, String state, String zip1, String country) {
        this(number, street, DEFAULT_STREET2, city, state, zip1, DEFAULT_ZIP2, country);
    }


}
