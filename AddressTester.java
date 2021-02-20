public class AddressTester {

    public static void main(String[] args) {
        AddressOld address1 = new AddressOld("50", "Phelan Ave", "San Francisco", "CA", "94112", "0000", "USA");
        AddressOld address2 = new AddressOld("924", "Presidio Ave", "San Francisco", "CA", "94115", "USA");

        Address a1 = new Address.AddressBuilder("50", "Phelan", "94112")
                // invoke as many builder methods as I want IN ANY ORDER
                .city("San Francisco")
                .state("CA")
                .zip2("000")
                .country("USA")
                .build();
    }

}
