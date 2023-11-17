public class Array_Handler {
public static int oderId = 1;
public static int employeerId = 0;
    private Object array[]; // array ekak hadadi array declaration size eka dapan

   private int index = 0;

    public Array_Handler(Object[] array) {
        this.array = array;
    }
    public void addItems(Object array_array_item) {
        extendArray();
        this.array[array.length-1] = array_array_item;
    }

    public void removeItem(String array_itemName) {
        reduceArray(searchItem(array_itemName));
    }
    public void removeItem(int array_itemName) {
        reduceArray(search_id(array_itemName));
    }
    private void reduceArray(int array_itemLocation){
        Object[] temp_array_items = new Object[array.length == 0 ? 0 : array.length - 1];
        // This is the ternary operate in java which is similar as the if else block
        // ? = if : = else
        for (int i = 0; i < array.length; i++) {
            if (i<array_itemLocation) {
                temp_array_items[i] = array[i];
            } else {
                temp_array_items[i] = array[i+1];
            }
        }
        array = temp_array_items;
    }
    private int searchItem (String array_itemName){
        for (int i = 0 ; i< array.length ; i++){
            if (array[i].equals(array_itemName)){
                return i;
            }
        }
        return -1;
    }
    private void extendArray(){
        Object[] temp_array_items = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp_array_items[i] = array[i];
        }
        array = temp_array_items;
    }

    private int search_id (int id){
        for (int i = 0 ; i< array.length ; i++){
            if (array[i].equals(id)){
                return i;
            }
        }
        return -1;
    }
    public Object getObject(String id) {
        return array[searchItem(id)];
    }
    public Object getObject(int id) {
        return array[search_id(id)];
    }
    public boolean available_object(String id){
        return searchItem(id) != -1 ? true : false;
    }
    public boolean available_object(int id){
        return search_id(id) != -1 ? true : false;
    }
    public Object[] getArray(){
        return array;
    }
}
