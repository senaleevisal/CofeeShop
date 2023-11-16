public class Order {
    private int id;
    private Customer customer;
    private Employee employee;

    public Order(int orderId, Customer customer, Employee employee) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
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