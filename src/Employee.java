public class Employee {

    private int id;
    private String name;
    private String role;
    private String nic;
    private String email;

    public Employee(int id, String name, String role, String nic , String email) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.nic = nic;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setRole(String role) {

        this.role = role;
    }

    public String getName() {

        return name;
    }

    public String getRole() {

        return role;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean equals(String nic){
        return this.nic == nic;
    }
}
