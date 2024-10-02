public class Order_Enc_Q5 {

    private int orderId;
    private String product;
    private int quantity;
    private double price;

    // set for modifing..

    // setQuantity(quantity);
    // setPrice(price);

    Order_Enc_Q5(int orderId, String product, int quantity, double price) {

        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // getters and setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("quantity Must be positive");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("price must be positive");
        }
    }

    // calculate total cost
    public double totalCost() {
        return this.quantity * this.price;
    }

    // display

    public void displayOrder() {

        System.out.println("Order ID : " + orderId);
        System.out.println("Product name : " + product);
        System.out.println("Quatity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("Total cost : " + totalCost());
    }

    public static void main(String[] args) {

        Order_Enc_Q5 order = new Order_Enc_Q5(123, "Mobile", 3, 800);
        order.displayOrder();

        System.out.println();

        System.out.println("After changing the values of quantities and products....");

        order.setQuantity(4);
        order.setPrice(700);
        order.displayOrder();

        System.out.println();
        System.out.println("After negative value...");

        order.setQuantity(-4);
        order.setPrice(-700);
        order.displayOrder();

    }

}
