import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.*;
public class Main {
    static CofeeShop cofeeShop  = new CofeeShop();
    public static Scanner input = new Scanner(System.in);
    public static Array_Handler coffee = new Array_Handler(new MenuItem[0]);
    public static Array_Handler sweets = new Array_Handler(new MenuItem[0]);
    public static Array_Handler fruit_juice = new Array_Handler(new MenuItem[0]);
    public static Array_Handler short_eats = new Array_Handler(new MenuItem[0]);

    //MAIN METHOD...
    public static void main(String[] args) {
        new UI().welcome();
        new UI().coffeeshop();
        greeting();
        new UI().menuDisply();

        while (true) {
            ClearConsole();
            int num = -1;
            num = input.nextInt();

            switch (num) {
                case 1:
                    PlaseOder();
                    break;
                case 2:
                    SearchOder();
                    break;
                case 3:
                    deleteOder();
                    break;
                case 4:
                    searchCustomer();
                    break;
                case 5:
                    deleteCustomer();
                    break;
                case 6:
                    searchEmployer();
                    break;
                case 7:
                    deleteEmployer();
                    break;
                case 8:
                    addFoodItem();
                    break;
            }
        }
    }

    public static void greeting() {
        Date now = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String currentTime = dateFormat.format(now);

        // Generate the greeting based on the time of day
        String greeting = generateGreeting(currentTime);

        // Display the greeting
        System.out.println(greeting);


    }
        private static String generateGreeting(String currentTime){
            int hour = Integer.parseInt(currentTime.substring(0, 2));

            if (hour >= 0 && hour < 12) {
                return "\n\nGood morning!";
            } else if (hour >= 12 && hour < 18) {
                return "\n\nGood afternoon!";
            } else {
                return "\n\nGood evening!";
            }
        }

        public static void deleteEmployer(){

        }
        public static void searchEmployer(){

        }
        public static void deleteCustomer(){

        }
        public static void searchCustomer() {
            String CustomerPhoneNumber;
            int totalAmount = 0;
            System.out.println("\t   _____                     _        _____          _                            ");
            System.out.println("\t  / ____|                   | |      / ____|        | |                           ");
            System.out.println("\t | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ");
            System.out.println("\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|");
            System.out.println("\t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   ");
            System.out.println("\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   ");
            System.out.println("\t---------------------------------------------------------------------------------------------");
            System.out.println();
            L4:while(true) {

                System.out.print("\tEnter Customer Phone Number : ");
                CustomerPhoneNumber = input.next();
                System.out.println();
                System.out.printf("\t\t\t+----------+----------+---------------+\n");
                System.out.printf("\t\t\t|   %-6s |   %-6s |     %-9s |\n", "size", "QTY", "Amount");
                System.out.printf("\t\t\t+----------+----------+---------------+\n");
            }
        }


        public static void changeOrderStatus () {

        }



        private static void PlaseOder () {
            L3:while(true) {
                String customerPhoneNumber ;
                int qty ;
                ClearConsole();
                String oderIdWithFiveDigit  = String.format("%05d", Array_Handler.oderId);
                System.out.println("\t _____  _                   ____          _           ");
                System.out.println("\t|  __ \\| |                 / __ \\        | |          ");
                System.out.println("\t| |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ ");
                System.out.println("\t|  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|");
                System.out.println("\t| |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   ");
                System.out.println("\t|_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   ");
                System.out.println("     ___________________________________________________________");
                System.out.println("\t\n\nOrder ID : ODR#" + oderIdWithFiveDigit );
                System.out.println();

                while (true) {

                    System.out.println("\nHello, would you like to order anything? (yes/no)");

                    String userInput = input.nextLine();

                    if (userInput.equalsIgnoreCase("yes")) {
                        System.out.println("\nGreat! Please provide the product code you'd like to order:");
                    }
                    System.out.print("\tEnter Customer Phone Number : ");
                    customerPhoneNumber = input.next();
                    if (!PhoneNumberIsCorrect(customerPhoneNumber)) {
                        System.out.println("\n\t\tInvalid Phone Number..Try again \n");
                        System.out.print("\tDo you want to enter phone nuber again? (y/n) : ");
                        char YesOrNo = input.next().charAt(0);
                        if (YesOrNo == 'y' || YesOrNo == 'Y') {
                            System.out.print("\033[6A"); //<---- Move the cursor up five lines ....
                            System.out.print("\033[0J"); //<---- Clear the lines ....
                        } else if (YesOrNo == 'n' || YesOrNo == 'N') {
                            return; //<---- move to starting point ....
                        }
                    } else
                        break;
                }
                if (cofeeShop.getCustomers().available_object(customerPhoneNumber)) {
                    Customer customer = (Customer) cofeeShop.getCustomers().getObject(customerPhoneNumber);
                    System.out.println(customer.getName() +" is Already Registered....! ");

                }else {
                    System.out.print("Enter Name\t:");
                    String customerName = input.next();
                    System.out.print("Enter Email\t:");
                    String customerEmail = input.next();
                    System.out.print("Enter NIC\t;");
                    String customerNic = input.next();
                    Customer customer = new Customer(customerName , customerEmail , customerPhoneNumber , customerNic);
                    cofeeShop.getCustomers().addItems(customer);
                    System.out.println(" Successfully Registered...! ");
                }


            }
        }
    public static boolean PhoneNumberIsCorrect(String phone){ //<<<< phone number checking part ....

        if(phone.length()!=10||phone.charAt(0)!='0' ){
            return false;

        }else{
            for (int i = 0; i < phone.length(); i++) {

                if (!Character.isDigit(phone.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
        public static void ClearConsole() { //<<<< console clear part ....
            try {
                final String os = System.getProperty("os.name");
                if (os.contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            } catch (final Exception e) {
                e.printStackTrace();
                // Handle any exceptions.
            }
            cofeeShop.getOrders();
        }
    public static void addFoodItem(){ // <-- This method use add a FOOD for the program..
        L1:while(true) {

            int foodId = MenuItem.id+=1;
            System.out.println("Fod Item ID\t:" + foodId);
            System.out.println("Enter Food Name\t:");
            String foodName = input.next();
            System.out.println("Enter Food Price\t:");
            double priceOfFood = input.nextDouble();
            System.out.println("Enter the FOOD type");
            System.out.println("\t1. Coffee");
            System.out.println("\t2. Sweets");
            System.out.println("\t3. Fruit Juice");
            System.out.println("\t4. Shorteats");
            int foodType = input.nextInt();
            System.out.print("Do you want to add this item..? (y/n)");
            String YesOrNo1 = input.next();
                if (YesOrNo1.equalsIgnoreCase("yes") || YesOrNo1.equalsIgnoreCase("y")) {
                    MenuItem MenuItem = new MenuItem(foodId, foodName, priceOfFood);

                }else {
                    break L1;
                }

            System.out.println("Successfully Added Food Item !");
            System.out.println("Do You Want to Add Another Food Item..? (Y/N)");
            String YesOrNo2 = input.next();
                if (YesOrNo2.equalsIgnoreCase("yes") || YesOrNo2.equalsIgnoreCase("y")) {

                }else {
                    break L1;
                }
        }
    }


    public static void  setFood(MenuItem item){
        switch (item.getType()) {
            case 1:
                coffee.addItems(item);
                break;
            case 2:
                sweets.addItems(item);
                break;
            case 3:
                fruit_juice.addItems(item);
                break;
            case 4:
                short_eats.addItems(item);
                break;
        }
    }
    
    public static void menu()
    {

    }
}

            ///////////////////////////////
            public static void deleteOder(){
                ClearConsole();
                String oderIdTemp ;
                System.out.println("\t      _      _      _          ____          _           \r" );
                System.out.println("\t     | |    | |    | |        / __ \\        | |          \r" );
                System.out.println("\t   __| | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ \r" );
                System.out.println("\t  / _` |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|\r");
                System.out.println("\t | (_| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   \r");
                System.out.println("\t  \\__,_|\\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   \r");
                System.out.println();
                System.out.println("\t______________________________________________________________________");
                System.out.println();
                L5:while(true){
                    System.out.print("\tEnter oder ID : ODR#");
                    oderIdTemp = input.next();
                    int foundIndex = searchIndex(oderIdTemp);
                    if (foundIndex == -1){
                        System.out.println("\n\t\tInvalid ID..");

                    }else {
                        System.out.println("\n\tPhone Number \t: " + phonenNumberArr[foundIndex]);
                        System.out.println("\tsize \t\t : " + SizeArr[foundIndex]);
                        System.out.println("\tQTY \t\t : " + qtyArr[foundIndex]);
                        System.out.println("\tAmount \t\t : " + AmountArr[foundIndex]);
                        //System.out.println("\nStatus \t\t : " + statusArr[foundIndex]);

                    }
                    System.out.print("\n\tDo you want to delete this oder ? (y/n) : ");
                    char yesOrNo = input.next().charAt(0);
                    if (yesOrNo == 'y' || yesOrNo == 'Y'){
                        OderIdArr = deleteStringOder (OderIdArr, foundIndex);
                        phonenNumberArr = deleteStringOder(phonenNumberArr,foundIndex);
                        SizeArr = deleteStringOder(SizeArr, foundIndex);
                        qtyArr = deleteintArr (qtyArr , foundIndex);
                        AmountArr = deleteintArr(AmountArr , foundIndex);
                        System.out.println("\t\tOder deleted..!");

                    }

                    System.out.print("\n\tDo you want to place another oder? (y/n) : ");
                    char YesOrNo2 = input.next().charAt(0);
                    if (YesOrNo2 == 'y' || YesOrNo2 == 'Y')
                        continue L5;
                    else{
                        return;
                    }
                }
            }

            ///////////////////////////////
            public static void  SearchOder(){

                ClearConsole();
                System.out.println("\t   _____                     _        ____          _           ");
                System.out.println("\t  / ____|                   | |      / __ \\        | |          ");
                System.out.println("\t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ ");
                System.out.println("\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|");
                System.out.println("\t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   ");
                System.out.println("\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|   ");
                System.out.println("\t--------------------------------------------------------------------------");
                System.out.println();
                String SCustomerOderID ;
                System.out.print("\tEnter order ID : ODR#");
                SCustomerOderID = input.next();
                int foundIndex = searchIndex(SCustomerOderID);
                if (foundIndex == -1){
                    System.out.println("\n\t\tInvalid ID..");
                }else {
                    System.out.println("\tPhone Number \t: " + phonenNumberArr[foundIndex]);
                    System.out.println("\n\tsize \t\t : " + SizeArr[foundIndex]);
                    System.out.println("\n\tQTY \t\t : " + qtyArr[foundIndex]);
                    System.out.println("\n\tAmount \t\t : " + AmountArr[foundIndex]);
                    System.out.println("\n\tStatus \t\t : " + statusArr[foundIndex]);
                }

                System.out.print("\n\tDo you want to search another customer report? (y/n) : ");
                char yesOrNo = input.next().charAt(0);
                if (yesOrNo == 'y' || yesOrNo == 'Y'){
                    ClearConsole();
                    SearchOder();
                } else {
                    ClearConsole();
                    FashionShop();
                }

            }
