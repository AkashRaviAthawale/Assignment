
public class Product_Class_Q3 {

    // Attributes of the Product class
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Getter and Setter methods for each attribute
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // calculate the total cost of the product
    public double calculateCost() {
        return this.price * this.quantity;
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Create an instance of Product
        Product_Class_Q3 product = new Product_Class_Q3();
        product.setProductId(121);
        product.setProductName("NAtural");
        product.setPrice(12000);
        product.setQuantity(2);

        System.out.println("Id is " + product.getProductId() + " : " + " Name is " + product.getProductName() + " : "
                + " price is " + product.getPrice()
                + " : " + " Quantity is " + product.getQuantity());

        // Calculate and print the total cost
        System.out.println("Total Cost: $" + product.calculateCost());
    }
}
