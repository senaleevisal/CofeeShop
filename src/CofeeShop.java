public class CofeeShop {
    private Array_Handler customers = new Array_Handler(new Customer[0]);
    private Array_Handler employees = new Array_Handler(new Employee[0]);
    private Array_Handler orders = new Array_Handler(new Order[0]);

    public void addCustomer(Customer customer){
        customers.addItems(customer);
    }

    public Array_Handler getCustomers() {
        return customers;
    }

    public Array_Handler getEmployees() {
        return employees;
    }

    public Array_Handler getOrders() {
        return orders;
    }

    public void addEmployee(Employee employee){
        employees.addItems(employee);
    }
    public void placeOrder(Order order){
        orders.addItems(order);
    }
    public void removeCustomer(Customer customer){

    }
}
