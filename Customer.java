public class Customer {
    //attributes
    private String name;
    private String phone;
    private String eMailAddress;

    public Customer(String name, String phone, String emailAddress) { //2 marks
        //complete the constructor
        this.name=name;
        this.phone=phone;
        this.eMailAddress=emailAddress;

    }

    //complete the getters()
    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmailAddress() {
        return this.eMailAddress;
    }

}
