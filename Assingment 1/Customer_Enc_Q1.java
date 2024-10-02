public class Customer_Enc_Q1 {
    // private attributes
    private int customerID;
    private String customerName;
    private String email;
    private String phone;

    // getters and setters

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // display

    public void displayCustomerInfo() {
        System.out.println("customerID : " + getCustomerID());
        System.out.println("customerName : " + getCustomerName());
        System.out.println("Email : " + getEmail());
        System.out.println("Phone : " + getPhone());
    }

    public static void main(String[] args) {

        // object of customer
        Customer_Enc_Q1 customer = new Customer_Enc_Q1();

        // set values
        customer.setCustomerID(121);
        customer.setCustomerName("Akash Athawale");
        customer.setEmail("akashathawale1212gmail.com");
        customer.setPhone("9378292810");

        // display
        customer.displayCustomerInfo();

    }

}