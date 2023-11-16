public class InventoryItem {
    private int id;

    private String name;

    private int quantity;

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String newName) {

        this.name = newName;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public boolean equals(String name){
        return this.name == name;
    }
}
