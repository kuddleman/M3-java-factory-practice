public class Address {

    //This is using the builder design pattern.

    //STEP 1  Declare all possible variables as private
    private String number, street, street2, city, state, zip1, zip2, country;

    // write build method to build an Address
    private Address(AddressBuilder builder) {
        this.number = builder.number;
        this.street = builder.street;
        this.street2 = builder.street2;
        this.city = builder.city;
        this.state = builder.state;
        this.zip1 = builder.zip1;
        this.zip2 = builder.zip2;
        this.country = builder.country;

    }

    public static class AddressBuilder {

        private String number, street, zip1;  // These are the NON-OPTIONAL fields to include in constructor
        private String street2 = "", city = "", state = "", zip2 = "", country = "";  // These are OPTIONAL;



        public AddressBuilder( String number, String street, String zip1) {
            this.number = number;
            this.street = street;
            this.zip1 = zip1;
        }
        // make one setter method for each optional field variable
        public AddressBuilder street2(String var) {
            this.street2 = var;
            return this;  // I'm returning the builder object.
        }
        public AddressBuilder city(String var) {
            this.city = var;
            return this;
        }
        public AddressBuilder state(String var) {
            this.state = var;
            return this;
        }
        public AddressBuilder zip2(String var) {
            this.zip2 = var;
            return this;
        }
        public AddressBuilder country(String var) {
            this.country = var;
            return this;
        }
        public Address build() {
            return new Address(this);
        }
    }
}
