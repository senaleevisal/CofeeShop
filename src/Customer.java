public class Customer {
    private String name;
    private String email;
    private String phone_number;
    private String nic;

    public Customer(String name, String email, String phone_number, String nic) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.nic = nic;
    }

    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPhone_number(String phone_number) {

        this.phone_number = phone_number;
    }

    public String getEmail() {

        return email;
    }

    public String getPhone_number() {

        return phone_number;
    }

    public String getNic() {

        return nic;
    }

    public void setNic(String nic) {

        this.nic = nic;
    }

    public boolean equals(String phone_number){

        return this.phone_number == phone_number;
    }
}
