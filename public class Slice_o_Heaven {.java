public class Slice_o_Heaven {
    public String storeAddress;
    private String storemenu;
    public String storeHours;
    public long storePhoneNumber;
    public String storeEmail;
    public String storeWebsite;
    public String pizaaname;
    public String sides;
    public String pizzaIngredients;
    public String drinks;

    private String orderID;
    private String orderDetails;
    private String orderStatus;
    private double orderTotal=15.00;
    private final String DEF_ORDER_ID="DEF-SOH-099";
    private final String DEF_PIZZA_INGREDIENTS="Mozzarella Cheese";
    private final double DEF_ORDER_TOTAL=15.00;
    public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }
    public String getorderID() {
        return this.orderID;
    }
    public void setorderID(String orderID) {
        this.orderID = orderID;
    }
    public String getorderDetails() {
        return this.orderDetails;
    }
    public void setorderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }
    public String getorderStatus() {
        return this.orderStatus;
    }
    public void setorderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public double getorderTotal() {
        return this.orderTotal;
    }
    public void setorderTotal(double orderTotal) {
       
        this.orderTotal = orderTotal;
    }

    public void Order() {
        this.orderID = DEF_ORDER_ID;
        this.orderDetails = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "None";
        this.drinks = "None";
      }  



    public void takeOrder(String id, String details, double ordertotal){
        
    ;

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");
    
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!")

    }
    public void makepizza(String id, String details, double ordertotal){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }
    
        System.out.println("Your pizza is ok!");

        printReceipt();
    }

    private void printReceipt(){
        Order();
        System.out.println("********RECEIPT********");

        System.out.println("Order ID: " + orderID);
        System.out.println("Order Details: " + orderDetails);
        System.out.println("Order Total: " + orderTotal);
    }
    
}
public void processCardPayment(String cardNumber, String expiryDate, int cvv) {
    int cardLength = cardNumber.length();
    if (cardLength == 14) {
        System.out.println("Card accepted");
    } else {
        System.out.println("Invalid card");
    }

    int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));

    String blacklistedNumber = "12345678901234"; 
    if (cardNumber.equals(blacklistedNumber)) {
        System.out.println("Card is blacklisted. Please use another card");
    }

    int lastFourDigits = Integer.parseInt(cardNumber.substring(cardNumber.length() - 4));

    String cardNumberToDisplay = cardNumber.charAt(0) + cardNumber.substring(1, cardNumber.length() - 4).replaceAll(".", "*") + cardNumber.substring(cardNumber.length() - 4);
    System.out.println("Display Card Number: " + cardNumberToDisplay);
}


public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
    String info = "Today's Special - Pizza: " + pizzaOfTheDay + ", Side: " + sideOfTheDay + ", Price: " + specialPrice;
    System.out.println(info);
}
}