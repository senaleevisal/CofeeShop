public class Order {
    private int id;
    private Customer customer;
    private Employee employee;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order(int id, Customer customer, Employee employee, double price) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean equals(int  id){
        return this.id == id;
    }
}