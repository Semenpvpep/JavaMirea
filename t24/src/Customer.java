public class Customer {
    final String firstName;
    final String secondName;
    final int age;
    final Address address;
    //private final Customer MATURE_UNKNOWN_CUSTOMER = new Customer("","", 21,new Address());
    //private final Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("","", 0,new Address());


    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    /*public Customer (int age) {
        this.age = age;
        if (age < 21) {
            this.firstName = NOT_MATURE_UNKNOWN_CUSTOMER.firstName;
            this.secondName = NOT_MATURE_UNKNOWN_CUSTOMER.secondName;
            this.address = NOT_MATURE_UNKNOWN_CUSTOMER.address;
        }
        else {
            this.firstName = MATURE_UNKNOWN_CUSTOMER.firstName;
            this.secondName = MATURE_UNKNOWN_CUSTOMER.secondName;
            this.address = MATURE_UNKNOWN_CUSTOMER.address;
        }
    }*/

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}